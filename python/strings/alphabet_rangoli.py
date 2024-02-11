"""
This module contains functions for printing rangoli patterns.
"""
def print_rangoli(size):
    """
    Print a rangoli pattern of a specific size.

    Args:
    size (int): The size of the rangoli pattern.

    Returns:
    None
    """
    # Generate the alphabet
    alphabet = 'abcdefghijklmnopqrstuvwxyz'

    # Create the rangoli pattern
    pattern = []
    for i in range(size):
        s = '-'.join(alphabet[i:size])
        pattern.append((s[::-1] + s[1:]).center(4 * size - 3, '-'))

    # Print the top half of the rangoli
    print('\n'.join(pattern[::-1] + pattern[1:]))

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
