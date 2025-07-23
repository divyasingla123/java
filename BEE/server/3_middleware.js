//req aur response k bich ka kam middleware karta hai aur ise hum app.use se likhte hai
//phle hmesha middleware chlega
//can use any number of middleware
const express= require('express');
const app= express();
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
app.listen(8080,()=>{
    console.log("server is running on port 8080");
})