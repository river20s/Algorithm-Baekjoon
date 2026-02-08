n = int(input())
input_list = [int(input()) for _ in range(n)]
cent_list = [25, 10, 5, 1]
output_list = []

for change in input_list:
    for cent in cent_list:
        output_list.append(change // cent)
        change = change % cent
    
for i in range(0, len(output_list), 4):
    print(*output_list[i:i+4])