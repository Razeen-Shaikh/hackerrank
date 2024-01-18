"""Find The Runner-Up Score"""

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arr = sorted(set(arr))

    print(arr[arr.index(max(arr)) - 1])
