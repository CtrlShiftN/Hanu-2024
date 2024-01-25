
// Object Destructuring
const college = {
	name : 'DTU',
	est : '1941',
	isPvt : false
};
let {name, est, isPvt} = college;
console.log(name, est, isPvt);

// Array Destructuring
const arr = ['lionel', 'messi', 'barcelona'];
let[value1,value2,value3] = arr;
console.log(value1, value2, value3);

