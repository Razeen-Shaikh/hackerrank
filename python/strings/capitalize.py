"""
This module contains the implementation of the solve function.
"""
import os

# Complete the solve function below.
def solve(s):
    """
    Capitalizes the first letter of each word in the input string.

    Args:
    s (str): The input string to be capitalized.

    Returns:
    str: The capitalized input string.
    """
    # Split the full name into individual words
    words = s.split(' ')  # Split based on spaces
    
    # Capitalize the first letter of each word
    capitalized_words = [word.capitalize() for word in words]
    
    # Join the capitalized words back together using the original number of spaces
    capitalized_full_name = ' '.join(capitalized_words)
    
    return capitalized_full_name

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w', encoding='utf-8')
    s = input()

    RESULT = solve(s)

    fptr.write(RESULT + '\n')

    fptr.close()
