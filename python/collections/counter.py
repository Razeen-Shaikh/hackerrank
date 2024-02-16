"""
Module description: This module contains code
for processing shoe sizes and customer purchases.
"""
from collections import Counter

num_shoes = int(input())
shoe_sizes = Counter(map(int, input().split()))
num_customers = int(input())

TOTAL_EARNED = 0

for _ in range(num_customers):
    size, price = map(int, input().split())
    if shoe_sizes[size] > 0:
        TOTAL_EARNED += price
        shoe_sizes[size] -= 1

print(TOTAL_EARNED)
