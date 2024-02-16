"""
This module provides functionality for printing combinations of characters in a given string.
"""
from itertools import combinations

S, r = input().split()
S = sorted(S)
r = int(r)

# Print combinations
for i in range(1, r + 1):
    for comb in combinations(S, i):
        print(''.join(comb))
