"""
This module contains the implementation of the minion game.
"""

def minion_game(string):
    """
    This function takes a string as input and
    calculates the scores for two players, Kevin and Stuart.
    
    Args:
    string (str): The input string for the game
    
    Returns:
    tuple: A tuple containing the scores of Kevin and Stuart in the game
    """
    vowels = 'AEIOU'
    kevin_score = 0
    stuart_score = 0
    length = len(string)

    for i in range(length):
        if string[i] in vowels:
            kevin_score += length - i
        else:
            stuart_score += length - i

    if kevin_score > stuart_score:
        print("Kevin", kevin_score)
    elif kevin_score < stuart_score:
        print("Stuart", stuart_score)
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)
