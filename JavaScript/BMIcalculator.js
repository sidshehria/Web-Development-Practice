function bmicalculator(weight, height){
    var bmi = weight / Math.pow(height,2);
    return Math.round(bmi);
}
var bmi = bmicalculator(83, 1.8);
console.log(bmi);
//height in meters and weight in kg
