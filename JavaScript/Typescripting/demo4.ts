function calculate_discount(price:number,rate:number = 0.50) { 
    var discount = price * rate; 
    console.log("Discount Amount: ",discount); 
    console.log("rate is: ",rate);
 } 
 calculate_discount(1000) 
 calculate_discount(1000,0.30)
 function calculate_discount1(price1:number,rate1?:number) { 
     if (rate1!=undefined)
    var discount1 = price1 * rate1; 
    console.log("Discount Amount: ",discount1); 
    console.log("rate is: ",rate1);
 } 
 calculate_discount1(1000) 
 calculate_discount1(1000,0.30)
 