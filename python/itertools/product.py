"""
This module demonstrates the usage of itertools.product
to compute the Cartesian product of input lists A and B.
"""
from itertools import product

A = list(map(int, input().split()))
B = list(map(int, input().split()))

for pair in product(A, B):
    print(pair, end=" ")
