
export enum EmployeeType { 
    Daily=0, Permanent, Contract, Retired 
}

export class Employee{
    employeeid : number;
    employeename : string
    salary : number;
    type: EmployeeType

    constructor(employeeid : number, employeename: string, salary: number,type: EmployeeType){
        this.employeeid=employeeid;
        this.employeename=employeename;
        this.salary=salary;
        this.type=type;
    }
}