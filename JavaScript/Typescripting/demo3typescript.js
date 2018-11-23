var vname = "swati";
console.log("Value of vname is " + vname);
//The variable stores a value of type string
var bname;
console.log("value bname is " + bname);
//The variable isa string variable. The variable's value is set undefined by default
var cname = "Swati";
console.log("Value of cname is " + cname);
//The variable's type is inferred from the dat type of the value.
//Here, the variable is of the type string
var lname;
console.log("Value of cname is " + lname);
var global_num = 12; //Global variable
var Employee = /** @class */ (function () {
    function Employee() {
        this.num_val = 13; //class variable
    }
    Employee.prototype.storeNum = function () {
        var local_num = 14; //local variable
        console.log(local_num);
    };
    Employee.prototype.storeNum1 = function () {
        var local_num = 14; //local variable
    };
    Employee.sval = 10; // static field
    return Employee;
}());
console.log("Global num: " + global_num);
console.log(Employee.sval); //static variable
var obj = new Employee();
console.log("Global num: " + obj.num_val);
console.log("Global num: " + obj.storeNum());
