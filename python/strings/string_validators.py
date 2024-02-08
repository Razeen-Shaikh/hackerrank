"""
This module provides functionality to check for alphanumeric,
alphabetic, and digit characters in a given input string.
"""

if __name__ == '__main__':
    s = input()
    ALNUM = ALPHA = DIGIT = LOWER = UPPER = False

    for char in s:
        if not ALNUM and char.isalnum():
            ALNUM = True
        if not ALPHA and char.isalpha():
            ALPHA = True
        if not DIGIT and char.isdigit():
            DIGIT = True
        if not LOWER and char.islower():
            LOWER = True
        if not UPPER and char.isupper():
            UPPER = True

    print(ALNUM)
    print(ALPHA)
    print(DIGIT)
    print(LOWER)
    print(UPPER)
