"""Swap Case"""
def swap_case(s):
    """
    Swap the case of each character in the input string.

    Args:
        s (str): The input string.

    Returns:
        str: The input string with the case of each character swapped.
    """
    return ''.join(c.lower() if c.isupper() else c.upper() for c in s)

if __name__ == '__main__':
    sentence = input()
    print(swap_case(sentence))
