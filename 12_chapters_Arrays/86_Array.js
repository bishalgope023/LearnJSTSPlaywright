let tests =["login", "checkout", "search"];

for (let index = 0; index <tests.length; index++) {
const element = tests[index];
console.log(element)
}

for (i=0; i<tests.length; i++){
    console.log (i, tests[i]);
}

//for ......of (cleanest for values)

for (let test of tests){
    console.log(test)
}