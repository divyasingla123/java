let arr=[1,2,3,4];
let arr2=arr;
let arr3=[...arr];
arr.push(5);
console.log(arr);
console.log(arr2);
console.log(arr3);

// Array destructuring
// let fruits=["apple","banana","mango"];
// console.log(fruits);
// let [a,b,c]=fruits; //like [a,,c]
// console.log(a); 
//console.log(b); if b not in array, it will be undefined
//console.log(c);