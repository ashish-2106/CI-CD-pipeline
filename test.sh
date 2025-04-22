#!/bin/bash
expected="Total Spent: ₹30.0"
actual=$(grep "Total Spent" output.txt)

if [[ "$actual" == "$expected" ]]; then
  echo "✅ Test passed."
  exit 0
else
  echo "❌ Test failed."
  echo "Expected: $expected, but got: $actual"
  exit 1
fi
