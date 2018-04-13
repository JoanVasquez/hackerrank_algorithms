#!/bin/python

import sys

def birthdayCakeCandles(n, ar):
    ar.sort();
    result = 0;
    for i in range(len(ar)):
        if(ar[i] == ar[len(ar)-1]):
            result += 1
    return result

n = int(raw_input().strip())
ar = map(int, raw_input().strip().split(' '))
result = birthdayCakeCandles(n, ar)
print(result)