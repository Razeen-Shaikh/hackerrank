"""Module description: Merge the tools"""

def merge_the_tools(string, k):
    """
    Merge the input string into substrings of length k
    and print each substring with unique characters.

    Args:
    string (str): The input string to be divided into substrings.
    k (int): The length of each substring.
    
    Returns:
    None
    """
    n = len(string)
    for i in range(0, n, k):
        substring = string[i:i+k]
        unique_chars = []
        for char in substring:
            if char not in unique_chars:
                unique_chars.append(char)
        print(''.join(unique_chars))

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
