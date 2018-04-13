import sys

def miniMaxSum(arr):
    sum = 0
    for i in range(len(arr)):
        sum += arr[i]
    print sum - arr[len(arr)-1], sum - arr[0]

if __name__ == "__main__":
    arr = map(int, raw_input().strip().split(' '))
    arr.sort();
    miniMaxSum(arr)