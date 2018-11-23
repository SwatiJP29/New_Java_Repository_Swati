class Student {
    sId : number;
    sName: string;
    sYear: number;
    sDept: string;

    constructor(sId : number,sName: string, sYear: number, sDept: string ){
        this.sId = sId;
        this.sName = sName;
        this.sYear = sYear;
        this.sDept = sDept;
    }

    var student1 = new Student(1002,"Vikash", 2,"ECE");
    var student2 = new Student(1003,"Amresh", 1,"Mech");
    var student3 = new Student(1001,"Uma", 3,"CSE");
    var student4 = new Student(1000,"Vaishali", 4,"E&I");


}
