'''
This module provides functions for printing a formatted
table of decimal, octal, hexadecimal, and binary representations of numbers.
'''

def print_formatted(number):
    """
    Prints a formatted table of decimal, octal, hexadecimal,
    and binary representations of numbers from 1 to n.

    Args:
    number (int): The upper limit of the range of numbers to print.

    Returns:
    None
    """
    # Determine the width based on the binary representation of number
    width = len("{0:b}".format(number))
    for i in range(1, number + 1):
        decimal = str(i)
        octal = "{0:o}".format(i)
        hexadecimal = "{0:X}".format(i)
        binary = "{0:b}".format(i)
        print(decimal.rjust(width), octal.rjust(width),
        hexadecimal.rjust(width), binary.rjust(width))

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
