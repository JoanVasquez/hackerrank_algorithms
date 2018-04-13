#!/bin/python

import sys

def breakingRecords(score):
    highScore = score[0]; lowScore = score[0]; highRecords = 0; lowRecords = 0;
    for i in range(len(score)):
        if score[i] > highScore: highScore = score[i]; highRecords += 1;
        if score[i] < lowScore: lowScore = score[i]; lowRecords += 1;
    return [highRecords, lowRecords]

if __name__ == "__main__":
    n = int(raw_input().strip())
    score = map(int, raw_input().strip().split(' '))
    result = breakingRecords(score)
    print " ".join(map(str, result))