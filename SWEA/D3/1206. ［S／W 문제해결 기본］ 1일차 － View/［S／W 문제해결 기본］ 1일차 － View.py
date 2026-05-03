T = 10

for test_case in range(1, T + 1):
    n = int(input()) # 빌딩 수
    buildings = list(map(int, input().split()))
    result = 0

    for i in range(2, n - 2):
        neighbors = buildings[i-2:i] + buildings[i+1:i+3]
        max_neighbor = max(neighbors)
        if buildings[i] > max_neighbor:
            result += buildings[i] - max_neighbor
            
    print(f"#{test_case} {result}")