const arr = [2, 5, 8, 5, 1, 5, 9];
let max =0;
for (i=0;i<arr.length;i++){
    if (arr[i] % 2 === 1) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
}
console.log(max);
