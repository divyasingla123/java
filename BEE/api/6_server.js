const express=require('express');
const chalk=require('chalk');
const app=express();
const port=3000;
const path=require('path');
app.set('view engine', 'ejs');
app.set("view",this.path.join(__dirname,"views"));
app.get("/home/:name",(req,res)=>{
    const name=req.params.name;
    res.render("6_index",{name:name});
})
module.exports=app;
