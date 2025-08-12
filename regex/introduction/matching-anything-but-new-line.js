var Regex_Pattern = /^...\....\....\....$/g; //Do not delete '/' and 'g'. Replace __________ with your regex.

function processData(Test_String) {
  var match = Regex_Pattern.test(Test_String);
  console.log(match);
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
  _input += input.trim();
});

process.stdin.on("end", function () {
  processData(_input);
});
