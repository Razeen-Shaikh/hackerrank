from collections import defaultdict

n, m = map(int, input().split())
A = [input() for _ in range(n)]
B = [input() for _ in range(m)]

word_indices = defaultdict(list)

for i, word in enumerate(A):
    word_indices[word].append(i+1)

for word in B:
    if word in word_indices:
        print(" ".join(map(str, word_indices[word])))
    else:
        print("-1")
