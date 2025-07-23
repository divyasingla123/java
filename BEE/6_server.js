const express=require('express');
const chalk=require('chalk');
const app=express();
const port=3000;
app.set('view engine', 'ejs');
app.listen(port,()=>{
    console.log(chalk.blue(`running on https://localhost:${port}`));
})
// app.get("/",(req,res)=>{
//     // res.render("6_index.ejs");
//     res.render("6_index");
// })
app.get("/home/:name",(req,res)=>{
    const name=req.params.name;
    res.render("6_index",{name:name});
})

