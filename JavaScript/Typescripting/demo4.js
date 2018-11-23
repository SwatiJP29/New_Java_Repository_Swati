function calculate_discount(price, rate) {
    if (rate === void 0) { rate = 0.50; }
    var discount = price * rate;
    console.log("Discount Amount: ", discount);
    console.log("rate is: ", rate);
}
calculate_discount(1000);
calculate_discount(1000, 0.30);
