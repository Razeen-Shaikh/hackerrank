N = int(input())
Columns = input().split()
total_marks = 0
for i in range(N):
    total_marks += int(input().split()[Columns.index("MARKS")])

print(total_marks/N)