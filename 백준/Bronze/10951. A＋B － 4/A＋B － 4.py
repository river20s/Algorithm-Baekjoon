sum = list()
while True:
  try:
    a, b = map(int, input().split())
    sum.append(a+b)
  except EOFError:
    break
print(*sum, sep="\n")