# Enter your code here. Read input from STDIN. Print output to STDOUT
import numpy

P = [float(i) for i in input().split()]
x = float(input())
print(numpy.polyval(P,x))