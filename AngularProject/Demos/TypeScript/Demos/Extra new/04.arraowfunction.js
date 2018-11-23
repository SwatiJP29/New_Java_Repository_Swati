// function fn()
// {
//     console.log('Hello');
// }
// fn();

// var  fn=()=>{
// console.log('Hello!');
// }
// fn();

// var  fn=()=>console.log('Hello!');
    
//     console.log(fn());


    // var  fn=()=>'Hello!';
    // // function fn()
    // // {
    // //     return 'Hello';

    // // }
    
    // console.log(fn());


    // var fn =a=>a+5;
    // console.log(fn(3));

    setTimeout(()=>console.log('Hello'),3000);
    function fn()
    {
        console.log(this);
    }
    fn();
    // var fn2=()=>console.log(this);
    // fn2();

var fn2=()=>console.log(this);
fn2();

