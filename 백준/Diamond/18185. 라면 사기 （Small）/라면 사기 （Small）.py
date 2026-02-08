# 앞에서부터 순회하면서:
# A[i] > 0일 때
# A[i+1]과 A[i+2] 비교해서 묶음 방식 결정하기
# A[i+1] > A[i+2]이면 2개 묶음 먼저
# A[i+1] <= A[i+2]이면 3개 묶음 먼저
# 가능한 만큼 묶음 쓰고 A값 감소
# 남으면 개별 처리
n = int(input())
store_list = list(map(int, input().split()))
amount = 0

for i in range(n):
  if store_list[i] > 0:
    # 2개 묶음 먼저 쓰기
    if i + 2 < n and store_list[i+1] > store_list[i+2]:
      count2 = min(store_list[i], store_list[i+1] - store_list[i+2])
      amount += count2 * 5
      store_list[i] -= count2
      store_list[i+1] -= count2
      
    # 3개 묶음
    if i + 2 < n:  
      count3 = min(store_list[i], store_list[i+1], store_list[i+2])
      amount += count3 * 7
      store_list[i] -= count3
      store_list[i+1] -= count3
      store_list[i+2] -= count3

    # 남으면 2개 묶음 
    if i + 1 < n:
      # 2개 묶음
      count2 = min(store_list[i], store_list[i+1])
      amount += count2 * 5
      store_list[i] -= count2
      store_list[i+1] -= count2
    
    # 개별 구매
    amount += store_list[i] * 3
    store_list[i] = 0

print(amount)