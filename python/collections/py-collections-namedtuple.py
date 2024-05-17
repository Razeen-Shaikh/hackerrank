# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import namedtuple

N = int(input())
Students = namedtuple("Students", input())
total_marks = 0
for i in range(N):
    student = Students(*(input().split()))
    total_marks += int(student.MARKS)

print(total_marks/N)
