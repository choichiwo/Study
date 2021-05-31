function forclear() {
    document.getElementById("main").innerHTML = "0";
}
function removeZero() {
    var value = document.getElementById("main").innerHTML;
    if (value == "0") {
        value = " "
        document.getElementById("main").innerHTML = value;
    }
}
function perc() {
    var value = document.getElementById("main").innerHTML;
    value = value / 100;
    document.getElementById("main").innerHTML = value;
}
function fordisplay(value) {
    removeZero()
    document.getElementById("main").innerHTML += value;
}
function solve() {
    removeZero()
    var equation = document.getElementById("main").innerHTML;
    var solved = eval(equation);
    document.getElementById('main').innerHTML = solved;
}