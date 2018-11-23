let numbers=[1,2,3,4,5];

function sumup(...toAdd)
{
    let result=0;
    for(let i=0;i<toAdd.length;i++)
    {
        result+=toAdd[i];
    }
    return result;
}
console.log(sumup(1,2,3,4));