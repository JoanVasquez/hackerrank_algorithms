#!/bin/python

import sys

def getTotalX(a, b):
    a.sort();
    b.sort();
    min = a[0];
    max = b[len(b)-1];
    count = 0
    for i in range(min, max):
        if isFactor(i, a, b) count ++
    

def isFactor(num, a[], b[]):
    aRes = true, bRes = true
    for i in range(len(a)):
        if num%a[i] != 0 aRes = false
    for i in range(len(b)):
        if b[i]%num != 0 bRes = false
    return aRes and bRes

if __name__ == "__main__":
    n, m = raw_input().strip().split(' ')
    n, m = [int(n), int(m)]
    a = map(int, raw_input().strip().split(' '))
    b = map(int, raw_input().strip().split(' '))
    total = getTotalX(a, b)
    print total