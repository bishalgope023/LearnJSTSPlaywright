let array = [1,2,3,];
console.log(array.length);

//adding a value (Push)
array.push (4);
console.log(array);

//Removing Value
array.pop ();
console.log(array);

//adding multiple
array.push(5,6);
console.log(array);

//ADD to the Begining
array.unshift(0);
console.log(array);

//Remove from Begining
array.shift();
console.log(array);

//[ 1, 2, 3, 5, 6 ] New Array
array.splice(2,1);
console.log(array);


 array.splice(2,0,99);
 console.log(array);

// array.splice(2,1,99);
// console.log(array);


// array.splice(2,2,99);
// console.log(array);


 array.splice(1,2,10,20);
 console.log(array);