var vname:string = "swati";
console.log("Value of vname is "+vname);

//The variable stores a value of type string

var bname:string;
console.log("value bname is "+bname);
//The variable isa string variable. The variable's value is set undefined by default

var cname="Swati";
console.log("Value of cname is " +cname);
//The variable's type is inferred from the dat type of the value.
//Here, the variable is of the type string

var lname;
console.log("Value of cname is " +lname);

var global_num = 12            //Global variable

class Employee {
    num_val = 13;             //class variable
    static sval = 10;         // static field

    storeNum(){
        var local_num = 14;  //local variable
        console.log(local_num)
    }
    storeNum1():void{
        var local_num = 14;   //local variable
        
}
}

console.log("Global num: "+global_num)
console.log(Employee.sval) //static variable

var obj = new Employee();
console.log("Global num: "+obj.num_val)
console.log("Global num: "+obj.storeNum())