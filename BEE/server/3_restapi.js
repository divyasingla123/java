//get->retrieveinfo
//route /user hi bnaege lekin usse get,adduser,remove user update user ka kese pta chlega
//->uske like get,post,put,delete method use krenge
//get->retrieve info
//post->frontend se backend data bhejne k liye
//patch->update info
//delete->remove info

const express= require('express');
const app= express();
//app.use(express.json()); //ye middleware hai jo body ko json mei convert kr deta hai
app.use(express.urlencoded());
let users=[];
app.get("/user",(req,res)=>{
    res.send(users);
})
app.post("/user",(req,res)=>{
    console.log(req.body); //body mei data aayega
    //res.send("info recieved");
    res.json({
        status: "success",
        info: req.body
    })
})
app.use(function(req,res,next){
    console.log("i am middleware 1");
    next(); //next se next middleware ya route pr chala jayega
})
app.use(function(req,res,next){
    console.log("i am middleware 2");
    next(); 
})
app.get('/',(req,res)=>{
    res.send('Hello World!');
})
app.listen(3000,()=>{
    console.log("server is running on port 8080");
})