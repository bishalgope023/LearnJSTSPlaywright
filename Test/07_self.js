const arr = [3, 7, 2, 9, 1, 8, 4];
let count =0;
for (i=1;i<arr.length;i++){
    if (arr[i]<5){
        count++;
    }
}
console.log(count);
