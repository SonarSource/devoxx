function sum(a, b) {
  return a + b;
}

function main() {
  var total = 0;
  for (var i = 0; i < 10; i++) {
    for (var j = 0; j < 10; j++) {
      total += sum(i, j);
    }
  }

  return total.foo();
}

function divide(divisor, dividend) {
  return divisor/dividend;
}

function doTheThing() {
  var divisor = 15;
  var dividend = 5;

  var result = divide(divisor, dividend);
  return result;
}