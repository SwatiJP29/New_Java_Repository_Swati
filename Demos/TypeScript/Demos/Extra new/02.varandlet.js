
// function start()
// {
//     for(var i=0; i<5;  i++)
//         console.log(i);

//     console.log(i);

// }
// start();

//  var ->Function -Scoped
//  ES6 -(ES2015) let and const ->block -scoped

//change the variable names i as var or let and check 
function start()
{
    for(var i=0;i<5;i++)
    {
        console.log(i);
    }
    console.log(i);

}
start();

// function start() {
//     for (var i = 0; i < 5; i++) {
//         if (true) {
//             let color = 'red';
//         }
//     }
//     console.log(color);

// }
// start();