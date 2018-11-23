interface Iloan{

    interest:number

}

class AgriLoan implements Iloan{

    interest:number;
    
    amount:number;

    constructor(interest?:number, amount?:number){
        //super();
        this.amount=amount
        this.interest=interest

    }


    

    display():void{
        console.log("display "+this.amount);
        console.log("display "+this.interest);
    }
}

var aa = new AgriLoan(10);

var bb = new AgriLoan(10,20);

aa.display();

bb.display();