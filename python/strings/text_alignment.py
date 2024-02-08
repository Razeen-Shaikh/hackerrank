#Replace all ______ with rjust, ljust or center. 

thickness = int(input()) #This must be an odd number
C = 'H'

#Top Cone
for i in range(thickness):
    print((C*i).rjust(thickness-1)+C+(C*i).ljust(thickness-1))

#Top Pillars
for i in range(thickness+1):
    print((C*thickness).center(thickness*2)+(C*thickness).center(thickness*6))

#Middle Belt
for i in range((thickness+1)//2):
    print((C*thickness*5).center(thickness*6))

#Bottom Pillars
for i in range(thickness+1):
    print((C*thickness).center(thickness*2)+(C*thickness).center(thickness*6))

#Bottom Cone
for i in range(thickness):
    print(((C*(thickness-i-1)).rjust(thickness)+C+(C*(thickness-i-1)).ljust(thickness)).rjust(thickness*6))
