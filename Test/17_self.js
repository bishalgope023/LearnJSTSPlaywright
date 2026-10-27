const arr = [1, 2, 3, 4];

console.log("Even Numbers:");
for (i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 0) {
        console.log(arr[i]);
    }

}

console.log("Odd Numbers:");

for (i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 1) {
        console.log(arr[i]);
    }

}
