"""
Module to generate and print permutations of a string
"""
from itertools import permutations

S, r = input().split()

possible_permutations = permutations(S, int(r))

for perm in sorted(possible_permutations):
    print("".join(perm))
