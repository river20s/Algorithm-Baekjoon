# '-' 기호로 구분해서 입력값 나누기
groups = input().split('-')
# 그룹별로 수행:
# '+' 기호로 나누기
group_sums = []
for group in groups:
  numbers = group.split('+')
  group_sums.append(sum(int(x) for x in numbers))
result = group_sums[0]
for i in range(1, len(group_sums)):
  result -= group_sums[i]
# groups[0]은 더하고 
print(result)
