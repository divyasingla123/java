// let http = require('http');

// http.createServer(function (req, res) {
//   res.writeHead(200, {'Content-Type': 'text/plain'});
//   res.end('Hello World!');
// }).listen(8080);


// client-server model
// clients request the server and server sends a page in response
// request and response is also an object

// why localhost?
// every site are hosted on diff platforms dont have any domain so we write localhost and their domain name
// and acc to that it sends response

// har site ko open krne k liye http use krna pdega

// it is difficult to create server from node.js we make it from express bcoz it is very lengthy and complicated with node.js,as  we cant give content type again and again

// yaha application package.json mei aati hai ya node module mei-ki humne express ya kisi aur ko install kra hai

// dependencies are the packages that we have installed in our project, like express, mongoose, etc
// localhost:3000/iphone/iam -3000 k baad k slash wala sara route hai,ise home route ya root route kehte hain

// using express
const express = require('express');
const app = express();
app.get('/', (req, res) => {  //callback function
  res.send('Hello World!');
})
//req and res -> object
  // req object -> frontend sai data bhejte hai woh sb ata hai
  // res object k andr jo ap send krte ho ooski poori information hoti hai

app.get('/testseries',(req,res)=>{
  console.log("hi");
  res.send('test series')
})
app.get('/testseriesend',(req,res)=>{
  res.send('test series end')
})

app.get("/users",(req,res)=>{

    res.send("ALL users")
  })
app.listen(3000,()=>{
  console.log("server is running..")
});


// ctrl + c => server close
// start -> node server.js
// everytime if we make any changes we need to restart the server

// nodemon -> install krna pdega agar server baar baar restart ni krna
//get request from search bar
//post request:-sending request from frontend to backend->backend pr frontend se info bhejna get request se
//form->available ni hai->postman use krege or wahan pr apka from replicate hoga

