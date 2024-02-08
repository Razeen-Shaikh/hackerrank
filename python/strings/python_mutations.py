def mutate_string(string, position, character):
    """
    Returns a new string with the character at the specified position replaced by the given character.

    Args:
        string (str): The original string
        position (int): The position at which to replace the character
        character (str): The character to insert at the specified position

    Returns:
        str: The modified string
    """
    return string[:position] + character + string[position+1:]

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)
