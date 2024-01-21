"""Division in Python"""

def main(a: int, b: int):
    """This function performs division of two numbers and prints the result."""
    print(a//b)
    print(a/b)

if __name__ == '__main__':
    a = int(input())
    b = int(input())
    main(a,b)