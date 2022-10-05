
function addi(){
    let a=+document.getElementById("s1").value;
    let b=+document.getElementById("s2").value;
    let s4=a+b;
    document.getElementById("s3").innerText= s4;
}
function subt() {
    let a=+document.getElementById("s1").value;
    let b=+document.getElementById("s2").value;
    let s5 = a - b;
    document.getElementById("s3").innerText = s5;
}
function mult() {
    let a=+document.getElementById("s1").value;
    let b=+document.getElementById("s2").value;
    let s6 = a * b;
    document.getElementById("s3").innerText = s6;
}
function divi() {
    let a=+document.getElementById("s1").value;
    let b=+document.getElementById("s2").value;
    let s7 = a / b;
    document.getElementById("s3").innerText = s7;
}