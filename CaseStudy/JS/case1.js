    class product{
        name
        img
        price
        amount
        constructor(name,img,price,amount) {
            this.name=name;
            this.img=img;
            this.price=price;
            this.amount=amount;
        }
        setName(name){
           return this.name=name;
        }
        setImg(img){
            return this.img=img;
        }
        setPrice(price){
            return this.price=price;
        }
        setAmount(amount){
            return this.amount=amount;
        }
    }
    let pro1=new product('váy chữ a','vaychuA.png',10,50);
    let pro2=new product('váy babydoll','vaybabydoll.png',11,172);
    let pro3=new product('áo hoodie','aohoodie.png',11,17);
    let pro4=new product('dép bánh mì','depbanhmi.png',3,435);
    let pro5=new product('áo blazer','aoblazer.png',15,12);
    let pro6=new product('người yêu..','tytyTQ.png',99999,1);
    let arr=[[pro6,pro2,pro4,pro1],[pro5,pro3]]
    let data;
    let flag=false;
    function init (){
        display(arr)
    }
    function display(ar){
            data="";
            data+="<table class='table3' >"
        for (let i=0;i<ar.length;i++){
            data+="<tr>"
            for (let j=0;j<ar[i].length;j++){
                data+=`<td class="block"><img class="imgBlock" src="img/${ar[i][j].img}"><br>Tên: ${ar[i][j].name}, Giá: ${ar[i][j].price} USD <br> Số lượng: ${ar[i][j].amount}<br>
                           <button class="edit_dele" onclick="edit(${i},${j})" type="button" data-toggle="modal" data-target="#exampleModal">Edit</button>
                           <button class="edit_dele" onclick="delete1(${i},${j})" >Delete</button> </td>`
            }
            data+="</tr>"
        }
        data+="<table>"
        document.getElementById("div2").innerHTML=data;
    }
    function add(){
        a=undefined;
        b=undefined;
        document.getElementById("name").value ="";
        document.getElementById("img").value="";
        document.getElementById("price").value="";
        document.getElementById("amount").value= "";
    }

    function delete1(i,j){
        let text = confirm("Bạn chắc chắn chứ: ");
        if (text===true){
            arr[i].splice( j,1)
        }
        console.log(arr)
        display(arr);
    }
    function thongBao(){
        alert("Bạn chưa đăng nhập!!")
    }
    function displayCart(){
        if (flag){
        }else {
            alert("Bạn chưa đăng nhập!!")
        }
    }
    let a;
    let b;
    function edit(i,j){
        document.getElementById("name").value = arr[i][j].name;
        document.getElementById("img").value= arr[i][j].img;
        document.getElementById("price").value= arr[i][j].price;
        document.getElementById("amount").value= arr[i][j].amount;
        a = i;
        b = j;
    }
    function save(){
        console.log(a)
        console.log(b)
        let name = document.getElementById("name").value;
        let img = document.getElementById("img").value;
        let price = document.getElementById("price").value;
        let amount = document.getElementById("amount").value;
        if (a===undefined||b===undefined){
             let p3 = new product(name,img,price,amount);
                sapXep(arr,p3);
        }else {
            arr[a][b].setName(name);
            arr[a][b].setImg(img);
            arr[a][b].setPrice(price);
            arr[a][b].setAmount(amount);
            console.log(arr);
        }
        document.getElementById("name").value = "";
        document.getElementById("img").value= "";
        document.getElementById("price").value= "";
        document.getElementById("amount").value= "";
        display(arr)
    }
    function search(){
        let flag1;
        let search = document.getElementById("search").value;
        let searchValue = document.getElementById("checkSearch").value;
        let arr2=[[]];
        if (search==""){
            display(arr)
        }else {
            if (searchValue==='name'||searchValue==='1'){
                for (let i=0;i<arr.length;i++){
                    for (let j=0;j<arr[i].length;j++){
                        let text = arr[i][j].name;
                        flag1 = text.includes(search);
                        if (flag1){
                            let text1 = arr[i][j];
                            sapXep1(arr2,text1)
                        }
                    }
                }
            }else if (searchValue==='price'){
                let search1=Number(search);
                let a = search1+5;
                let b = search1-5;
                for (let l=0;l<arr.length;l++){
                    for (let j=0;j<arr[l].length;j++){
                        let text = Number(arr[l][j].price);
                        let text1 = arr[l][j];
                        if (text>b && text<=a ){
                            sapXep1(arr2,text1);
                        }
                    }
                }
            }
            document.getElementById("search").value="";
            display(arr2)
        }
    }
    function sapXep(ar,text) {
        for (let i = 0; i < ar.length; i++) {
            if (ar[i].length < 4) {
                ar[i].push(text);
                break;

            } else {
                if (ar.length - i === 1) {
                        let arr1 = [];
                        ar.push(arr1);
                        ar[i + 1].push(text);
                        break;
                }
            }
        }
    }
    function search1(){
        let a = event.keyCode
        if (a===13){
            search();
        }
    }
    function sapXep1(ar,text) {
        for (let i =   0; i < ar.length;  i++) {
             if (ar[i].length < 4) {
                 ar[i].push(text);
                    break;
            } else {
                if (ar.length - i === 1) {
                    if (ar[i].length === 4) {
                        let arr1 = [];
                        ar.push(arr1);
                        ar[i + 1].push(text);
                        break;
                    }
                }
            }
        }
    }






