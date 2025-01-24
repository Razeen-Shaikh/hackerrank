def findZigZagSequence(a, n):
    """
    This function transforms the input array `a` into a zig-zag sequence.
    A zig-zag sequence is defined by the first half of the array being 
    in increasing order and the second half in decreasing order, with the 
    middle element being the largest.
    
    Parameters:
    a (list): The list of integers to be transformed.
    n (int): The length of the list `a`.
    
    Returns:
    None: The function prints the zig-zag sequence.
    """
    # Step 1: Sort the array
    a.sort()
    
    # Step 2: Find the mid index and swap the mid element with the last element
    mid = int((n + 1) / 2 - 1)
    a[mid], a[n-1] = a[n-1], a[mid]

    # Step 3: Reverse the second half of the array after the mid element
    st = mid + 1
    ed = n - 2
    while st <= ed:
        a[st], a[ed] = a[ed], a[st]
        st += 1
        ed -= 1

    # Step 4: Print the zig-zag sequence
    for i in range(n):
        if i == n-1:
            print(a[i])
        else:
            print(a[i], end=' ')

test_cases = int(input())
for cs in range (test_cases):
    n = int(input())
    a = list(map(int, input().split()))
    findZigZagSequence(a, n)



