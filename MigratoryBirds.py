#!/bin/python

import sys

def migratoryBirds(n, ar):
    elements = 0; count = 0;
    arr = [0] * n;
    
    for a in ar:
        arr[a] = arr[a]+1;
    
    for i in range(n):
        if arr[i] > count:
            count = arr[i];
            elements = i;
    
    return elements;

n = int(raw_input().strip());
ar = map(int, raw_input().strip().split(' '));
result = migratoryBirds(n, ar);
print(result);