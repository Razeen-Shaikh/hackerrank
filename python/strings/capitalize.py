#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):
    # Split the full name into individual words
    words = s.split(' ')  # Split based on spaces
    
    # Capitalize the first letter of each word
    capitalized_words = [word.capitalize() for word in words]
    
    # Join the capitalized words back together using the original number of spaces
    capitalized_full_name = ' '.join(capitalized_words)
    
    return capitalized_full_name

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()
