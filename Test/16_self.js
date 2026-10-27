const arr = [8, 4, 6, 2, 9];
let min = arr[0];
for (i=0;i<arr.length;i++){
    if(arr[i]<min){
        min = arr[i];
    }
}
console.log(min)