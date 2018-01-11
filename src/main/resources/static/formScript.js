function changeText(){
    var firstLine = document.getElementById("name").value;
    console.log("Tet from first file is = " + firstLine);
    var newText = "";
    newText = firstLine.toUpperCase();
    document.getElementById("change").value=newText;
}
