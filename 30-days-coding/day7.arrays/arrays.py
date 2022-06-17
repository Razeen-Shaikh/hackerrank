#!/bin/python3

import math
import os
import random
import re
import sys

def main(arr):
    arr.reverse()
    for i in arr:
        print(i, end =" ")

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))
    main(arr)
