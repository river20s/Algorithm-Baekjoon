n, k = map(int, input().split())
coin = [int(input()) for _ in range(n)]
count = 0

# 내림차순 정렬
coin.sort(reverse=True)

for a in coin:
    count += k // a
    k %= a

print(count)