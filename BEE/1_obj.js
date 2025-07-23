//objects->key value pair
// let obj={
//     a:"divya",
//     b:100,
//     c:true,
// }
//everything in js is object
//everything in java is classes and objects
//console.log(obj.a); // accessing value of key a

// let hostlers={
//         name:"divya",
//         age:20,
//         hostelinfo:{
//             name:"pi",
//             warden:"suman",
//             work:{
//                 degree:"cse",
//                 favoritedestination:"jhansla city"
//             }
//         }
// }
// console.log(hostlers)
// let obj2=hostlers;
// hostlers.warden="bali";
// console.log(hostlers);
// console.log(obj2);


//spread operator-> ...
//shallow copy
// let hostlers={
//         name:"divya",
//         age:20,
//         hostelinfo:{
//             name:"pi",
//             warden:"suman",
//             work:{
//                 degree:"cse",
//                 favoritedestination:"jhansla city"
//             }
//         }
// }
// let arr2={...hostlers};
// hostlers.warden="bali";
// hostlers.hostelinfo.work.favoritedestination="delhi";
// console.log(hostlers);
// console.log(arr2);

//deep copy
let hostlers={
        name:"divya",
        age:20,
        hostelinfo:{
            name:"pi",
            warden:"suman",
            work:{
                degree:"cse",
                favoritedestination:"jhansla city"
            }
        }
}
let arr2=JSON.parse(JSON.stringify(hostlers));
hostlers.warden="bali";
hostlers.hostelinfo.work.favoritedestination="delhi";
console.log(hostlers);
console.log(arr2);



