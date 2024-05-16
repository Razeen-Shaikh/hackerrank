# Enter your code here. Read input from STDIN. Print output to STDOUT
t = int(input())

for i in range(t):
    [a, b] = input().split()
    try:
        print(int(a)//int(b))
    except ZeroDivisionError as e:
        print("Error Code:", e)
    except ValueError as e:
        print("Error Code:", e)