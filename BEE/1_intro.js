//variable types:-
//primitive types: number, string, boolean, null, symbol
//non primitive types: object, array


//note:in js everything is an object
//array-object
//function-object

//loop
// for(let i=0;i<10;i++){
//     console.log(i);
// }

//is prime??
let number=13
let flag=true;
for(let div=2;div<number;div++){
    if(number%div==0){
        flag=false;
        break;
    }
}
if(flag==true){
    console.log(number,"Prime");
}
else{
    console.log(number,"Not Prime");
}

//array
let array=[1,2,3,4,5,6,7,8,9,10];
//console.log(array);
//console.log(array.length);
// for(let i=0;i<array.length;i++){
//     console.log(array[i]);
// }

//functions
// 1) push,unshift
// array.push(100); // adds 100 at the end
// array.push("hello");
// array.push(true);
// array.push(null);
// console.log(array);

//2) unshift-> adds element at the start
// array.unshift("i will be at the start");
// console.log(array);

//3) pop and shift
// array.pop(); // removes the last element
// console.log(array);

//shift->first element removal
// array.shift(); // removes the first element
// console.log(array);


//4) splice and slice
//slice extracts the part of the array and returns a new array
//does not harm original array
// let arr=array.slice(2); 
// console.log(array);
// console.log(arr);


//removes from 2 index and removes 4 elements
//effects the original array
array.splice(2,4);
console.log(array);
