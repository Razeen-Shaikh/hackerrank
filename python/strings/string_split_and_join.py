"""String Split and Join"""

def split_and_join(sentence):
    """
    Split the input string by spaces and join the resulting list with hyphens.
    
    Args:
    sentence (str): Input string to be split and joined.
    
    Returns:
    str: The resulting string after split and join operations.
    """
    return "-".join(sentence.split())

if __name__ == '__main__':
    line = input()
    RESULT = split_and_join(line)
    print(RESULT)
