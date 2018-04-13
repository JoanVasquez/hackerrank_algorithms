import sys

def solve(grades):
    for i in range(len(grades)):
        grades[i] = grades[i] if grades[i] < 38 or grades[i]%5 < 3 else grades[i] + (5 - (grades[i] % 5))
    return grades

n = int(raw_input().strip())
grades = []
grades_i = 0
for grades_i in xrange(n):
    grades_t = int(raw_input().strip())
    grades.append(grades_t)
result = solve(grades)
print "\n".join(map(str, result))