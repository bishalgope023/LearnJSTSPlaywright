const arr = [2, 5, 8, 5, 1, 5, 9];
let sum = 0;
for(i=0;i<arr.length;i++){
    if (arr[i]%2===1){
    sum += arr[i];}
}
console.log(sum);