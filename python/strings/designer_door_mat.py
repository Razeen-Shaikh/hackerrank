"""
Module to generate and print a door mat pattern with the given number of rows and columns.
"""

def print_door_mat(rows, cols):
    """
    Print a door mat pattern with the given number of rows and columns.

    Args:
        rows (int): The number of rows in the door mat.
        cols (int): The number of columns in the door mat.
    """
    # Calculate the pattern for the top part of the door mat
    for i in range(1, rows // 2 + 1):
        pattern = ".|." * (2 * i - 1)
        print(pattern.center(cols, "-"))

    # Print the welcome message
    print("WELCOME".center(cols, "-"))

    # Calculate the pattern for the bottom part of the door mat
    for i in range(rows // 2, 0, -1):
        pattern = ".|." * (2 * i - 1)
        print(pattern.center(cols, "-"))

# Example usage:
rows, cols = map(int, input().split())
print_door_mat(rows, cols)
