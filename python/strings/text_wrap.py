"""
Module for wrapping input strings into multiple lines to fit within the specified maximum width.
"""
import textwrap

def wrap(string, max_width):
    """
    Wraps the input string into multiple lines to fit within the specified maximum width.
    
    Args:
    string (str): The input string to be wrapped.
    max_width (int): The maximum width for each line.

    Returns:
    str: The wrapped string with line breaks.
    """
    return "\n".join(textwrap.wrap(string, width=max_width))

if __name__ == '__main__':
    word, maximum_width = input(), int(input())
    RESULT = wrap(word, maximum_width)
    print(RESULT)
