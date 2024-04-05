def average(array):
    """
    Calculates the average of a given array.

    Args:
        array (list): The array to calculate the average from.

    Returns:
        float: The average of the array.
    """
    return sum(set(array)) / len(set(array))

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
