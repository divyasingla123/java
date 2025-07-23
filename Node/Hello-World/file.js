const fs = require("fs");

//for creating a new file(txt)
//fs.writeFileSync("./Name.txt","hey there abc");


//creating file asynchronously
//fs.writeFile("./testAsync.txt","hey there async file", (err) => {});


//for reading data from other file
// const result = fs.readFileSync("./Name.txt","utf-8")
// console.log(result);


//for reading file data async
// fs.readFile("./Name.txt","utf-8",(err,result)=>{
//     if(err){
//         console.log("error",err);
//     }
//     else{
//         console.log(result);
//     }
// });


//for appending data in a file
//fs.appendFileSync("./Name.txt",new Date().getDate().toLocaleString());
//fs.appendFileSync("./Name.txt","Hey\n");



//if you want to make copy of the file (it will also create file)
//fs.cpSync("./Name.txt","test.txt");


//delete a file
//fs.unlinkSync("testAsync.txt");


//to see a file in stats
//console.log(fs.statSync("./Name.txt"));