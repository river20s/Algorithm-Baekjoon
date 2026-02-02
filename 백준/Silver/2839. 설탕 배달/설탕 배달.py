n = int(input())

for i in range(n // 5, -1, -1):
    weight = n - 5 * i  # 최대로 5kg 가져갈 수 있는 수 뺀 남은 무게
    if weight % 3 == 0: # 남은 무게가 3으로 나누어 떨어지면 OK
        print(weight // 3 + i)
        break   
else:
    print(-1)
    