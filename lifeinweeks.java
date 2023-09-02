function lifeinweeks(age){
    var yearsremaining = 90 - age;
    var days = yearsremaining * 365;
    var weeks = yearsremaining * 52;
    var months = yearsremaining * 12;

    console.log("You have "+ days + "days, "+ weeks +" weeks, and "+ months +" months left.");
}

lifeinweeks(12);
