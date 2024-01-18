"""List Functions in Python"""

if __name__ == '__main__':
    N = int(input())
    nums = []
    for i in range(N):
        command = input().split()
        command_name = command[0]
        command_functions = {
            "insert": lambda i, e: nums.insert(i, e),
            "print": lambda: print(nums),
            "remove": lambda e: nums.remove(e),
            "append": lambda e: nums.append(e),
            "sort": lambda: nums.sort(),
            "pop": lambda: nums.pop(),
            "reverse": lambda: nums.reverse()
        }
        if command_name not in command_functions:
            print("Invalid command!")
            continue
        command_function = command_functions.get(command_name)(*(list(map(int, command[1:]))))
