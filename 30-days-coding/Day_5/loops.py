#!/bin/python3

import math
import os
import random
import re
import sys

def main(n):
    for i in range(1,11):
        print(n, "x", i, "=", (n * i))

if __name__ == '__main__':
    n = int(input())
    main(n)
