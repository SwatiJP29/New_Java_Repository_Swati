

//  let obj={
//     name:'rash',
//     age:27

// }
// console.log(obj);

 let name='rashmi';
 let  age =30;

let obj={
    name,
    age,
    greet()
    {
        console.log(this.name +' , ' +this.age);
    }

}
obj.greet();
console.log(obj);