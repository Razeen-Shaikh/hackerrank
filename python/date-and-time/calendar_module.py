# Enter your code here. Read input from STDIN. Print output to STDOUT
import calendar

[mm, dd, yyyy] = map(int, input().split())
weekdays = {
    0: "MONDAY",
    1: "TUESDAY",
    2: "WEDNESDAY",
    3: "THURSDAY",
    4: "FRIDAY",
    5: "SATURDAY",
    6: "SUNDAY"
}

print(weekdays[calendar.weekday(yyyy, mm, dd)])