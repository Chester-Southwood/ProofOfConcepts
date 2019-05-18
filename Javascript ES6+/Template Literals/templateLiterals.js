
let word1 = "Chester";
let word2 = "Southwood";

const oldWay = word1 + " " + word2;

const newWay = `${word1} ${word2}`;

const num = `${2+3}`;

const nextLineExample = `Hello${'\n'}World`;

document.getElementById('one').innerText = oldWay;
document.getElementById('two').innerText = newWay;
document.getElementById('three').innerText = num;
document.getElementById('four').innerText = nextLineExample;
