const arr = [5, 9, 2, 7, 1];

let smallest =arr[0];
let secondsmallest =arr[0];

for (i=1;i<arr.length;i++){
    if (arr[i]<smallest){
        secondsmallest = smallest;
        smallest = arr[i];
        }
        else if(arr[i]<secondsmallest){
            secondsmallest=arr[i];
        }
}
console.log(secondsmallest);
