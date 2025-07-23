// function name(param){
//     return "i am returning a value";
// }
// console.log(name());

// let name=function(){
//     return "way 2 of defining a function";
// }
// console.log(name());


// let obj={
//     name:"kuch bhi"
// }
// obj.parameteraesahi="nahi pta";
// console.log(obj);

// let arr=[1,2,3,4,5]; //index hi value ki key hai
// arr.push(233);
// arr.value=4567 
// console.log(arr);

// function esahi(){
//     console.log("welcome to my world");
// }
// esahi.g4="awesome";
// console.log(esahi);

// let a;
// console.log(a); //undefined

// Functions-> first class citizens->as a var treated,
// we can return a function we can pass a function

//anonymous function
// let a=function(){
//     console.log("i am an anonymous function");
// }
// console.log(a());


//IIFE -function-immediately invoked function expression
// (function kuchbhi(){
//     console.log("i am a function");
// })();

//arrow function
// let a=function(v1,v2){
//     return v1+v2;
// }
// let b=(v1,v2)=>{
//     return v1+v2;
// }
// let c=(v1,v2)=> v1+v2; //implicit return
//let d=(v1,v2)=> {return v1+v2 }; //error  //demand explicit return

//console.log(d(10,20));


//function returning a function
function iamreturningafunction(){
    console.log("m function return krta hu");
    return function(){
        console.log("i returned a function");
        return function(){
            console.log("i am nested function");
        }
    }
}
//console.log(iamreturningafunction()); //function
let val=iamreturningafunction();
 console.log(val()); //function

let rval=val();
console.log(rval());