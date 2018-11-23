var AgriLoan = /** @class */ (function () {
    function AgriLoan(interest, amount) {
        _this = _super.call(this) || this;
        this.amount = amount;
        this.interest = interest;
    }
    AgriLoan.prototype.display = function () {
        console.log("display " + this.amount);
        console.log("display " + this.interest);
    };
    return AgriLoan;
}());
var aa = new AgriLoan(10);
var bb = new AgriLoan(10, 20);
aa.display();
bb.display();
