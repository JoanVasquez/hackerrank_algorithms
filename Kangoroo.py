#!/bin/python

import sys

def kangaroo(x1, v1, x2, v2):
    res = "NO"
    if (x1<x2 and v1>v2):
        res = "YES" if ((x1-x2) % (v1-v2)) == 0 else "NO"
    return res

x1, v1, x2, v2 = raw_input().strip().split(' ')
x1, v1, x2, v2 = [int(x1), int(v1), int(x2), int(v2)]
result = kangaroo(x1, v1, x2, v2)
print(result)