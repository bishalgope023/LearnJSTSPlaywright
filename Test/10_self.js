const arr = [2, 5, 8, 5, 1, 5, 9];
let count =0;
for (i=0;i<arr.length;i++){
    if (arr[i]>=5){
        count++;
    }
}
console.log(count);