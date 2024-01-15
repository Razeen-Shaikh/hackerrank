if __name__ == '__main__':
    students = []
    
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append((name, score))
    
    grades = sorted(set(grade for name, grade in students))
    second_lowest_grade = grades[1] if len(grades) > 1 else grades[0]
    
    second_lowest_students = sorted(name for name, grade in students if grade == second_lowest_grade)
    
    for student in second_lowest_students:
        print(student)