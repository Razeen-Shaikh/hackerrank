"""
This module defines a function to print a full name.
"""
#
# Complete the 'print_full_name' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING first
#  2. STRING last
#

def print_full_name(first, last):
    """
    Print the full name by concatenating the first and last name.

    Args:
    first (str): The first name.
    last (str): The last name.

    Returns:
    str: The full name string.
    """
    print("Hello " + first + " " + last + "! You just delved into python.")

if __name__ == '__main__':
    first_name = input()
    last_name = input()
    print_full_name(first_name, last_name)
