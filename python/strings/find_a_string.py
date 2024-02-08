"""
Module description: This module contains a function for counting occurrences of a sub_string in a string.
"""

def count_substring(word, sub_string):
    """
    Count the occurrences of a sub_string in a string.

    Args:
        word (str): The original string to search.
        sub_string (str): The sub_string to count occurrences of.

    Returns:
        int: The number of occurrences of the sub_string in the string.
    """
    count = 0
    substr_len = len(sub_string)
    str_len = len(word)
    
    # Iterate through the original string
    for i in range(str_len - substr_len + 1):
        # Check if the sub_string matches the current slice of the original string
        if word[i:i+substr_len] == sub_string:
            count += 1
    
    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    COUNT = count_substring(string, sub_string)
    print(COUNT)