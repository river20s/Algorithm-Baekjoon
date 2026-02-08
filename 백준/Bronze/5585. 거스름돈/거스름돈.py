change = 1000 -int(input())
yen_list = [500, 100, 50, 10, 5, 1]
yen_count = 0

for yen in yen_list:
    yen_count += change // yen
    change = change % yen

print(yen_count)