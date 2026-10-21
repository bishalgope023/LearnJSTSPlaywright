let num =[10,1,22,2]
num.sort((a,b) => a-b);
console.log(num);
num.sort((a,b) => b-a);
console.log(num);



let fruits = ["banana", "apple", "cherry", "lichi"];
fruits.sort((a,b) => a.localeCompare(b));
console.log(fruits);