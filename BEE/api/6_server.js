const express = require("express");
const app = express();
const port = 4004;
const ejs = require("ejs");

app.set("view engine", "ejs");

app.use(express.static("public"));
// 
app.listen(port,()=>{
    console.log(`Server is running on port ${port}`);
})

app.get("/", (req,res)=>{
    res.render("home");
})