const express = require("express");
const app = express();
const bcrypt=require('bcrypt');
const port = 3002;
app.use(express.json())
app.get("/",(req,res)=>{
    res.send("Hello World");
})

app.get("/about",(req,res)=>{
    res.send("About Page...");
})
const users=[]

app.post("/register_user", (req,res)=>{

    let user_id;
    if(users.length==0){
        user_id=1;
    }else{
        user_id=users[users.length-1].id+1;
    }
    const hashedPassword=bcrypt.hashSync(req.body.password,0)
    const new_user={
        id:user_id,
        name:req.body.name,
        age:req.body.age,
        //password:req.body.password
        password:hashedPassword
    }
    users.push(new_user);
    console.log(users);                                     //run on post
    res.status(200).json({message:"User registered..."})   //on thunder client
})

app.put("/update_user/:id",(req,res)=>{ //:id is a parameter
    const user_id = req.params.id
   // console.log(user_id);
    for(let i=0;i<users.length;i++){
        if(users[i].id==user_id){
           users[i].name=req.body.name,
        users[i].age=req.body.age,
        users[i].password=req.body.password
        console.log(users)
        return res.status(200).json({message:"user updated success..."})
        }
    }
    res.status(400).json({message : "user not found..."})     //run on put
})
app.delete("/delete_user/:id",(req,res)=>{
    const user_id = req.params.id
    for(let i=0;i<users.length;i++){
        if(users[i].id==user_id){
        users.splice(i,1);  
        console.log(users)
        return res.status(200).json({message:"user deleted success..."})
        }
    }
    res.status(400).json({message : "user not found..."}) 
})
app.use(express.json())




app.listen(port,()=>{
    console.log("Server running....")
})