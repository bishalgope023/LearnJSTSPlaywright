// let scores = [45, 82, 91, 60, 73];
let grades = scores.map(item_score => item_score > 70 ? "Pass": "Fail");
console.log(grades);

// Filter
let passing = scores.filter(s => s >= 70);
console.log(passing);


let numbers = [1,2,3,4,5];

console.log(numbers.map(n => n * 4));
//Transform each element with same length of array
console.log(numbers.filter(n => n > 2));
//Select elements that meet condition with same Length or fewer