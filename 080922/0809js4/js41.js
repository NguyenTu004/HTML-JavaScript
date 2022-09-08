function conver(){
    let s1=+document.getElementById("s1").value;
    let a1=+document.getElementById("a1").value;
    let a2=+document.getElementById("a2").value;
    let s=s1*(a1/a2);
    document.getElementById("ss").innerText= s;

}