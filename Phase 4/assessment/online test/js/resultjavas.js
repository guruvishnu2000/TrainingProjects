var i = 0;
var correctCount = 0 ;
//initialize the first question
generate(0);
// generate from json array data with index
function generate(index) {
    document.getElementById("question").innerHTML = jsonData[result].question;
    document.getElementById("answer").innerHTML = jsonData[result].answer;
}