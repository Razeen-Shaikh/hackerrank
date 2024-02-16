"""Arithmetic Operators in Python"""

def main(x, y):
    """
    This function takes two integers, `x` and `y`,
    and performs addition, subtraction, and multiplication on them.
    
    Parameters:
        x (int): The first integer.
        y (int): The second integer.
    """
    print(x + y)
    print(x - y)
    print(x * y)

if __name__ == '__main__':
    a = int(input())
    b = int(input())
    main(a, b)
