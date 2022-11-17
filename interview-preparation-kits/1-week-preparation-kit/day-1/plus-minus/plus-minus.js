/**
 * Given an array of integers,
 * calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with 6 places after the decimal.
 * Note: This challenge introduces precision problems.
 * The test cases are scaled to six decimal places,
 * though answers with absolute error of up to are acceptable.
 */

"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", function (inputStdin) {
  inputString += inputStdin;
});

process.stdin.on("end", function () {
  inputString = inputString.split("\n");

  main();
});

function readLine() {
  return inputString[currentLine++];
}

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function plusMinus(arr) {
  // Write your code here
  let positive_count = 0,
    negative_count = 0,
    zeroes_count = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 0) zeroes_count++;
    else if (arr[i] > 0) positive_count++;
    else negative_count++;
  }
  console.log((positive_count / arr.length).toFixed(6));
  console.log((negative_count / arr.length).toFixed(6));
  console.log((zeroes_count / arr.length).toFixed(6));
}

function main() {
  const n = parseInt(readLine().trim(), 10);

  const arr = readLine()
    .replace(/\s+$/g, "")
    .split(" ")
    .map((arrTemp) => parseInt(arrTemp, 10));

  plusMinus(arr);
}
