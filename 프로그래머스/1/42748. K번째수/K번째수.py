def solution(array, commands):
    # 1 5 2 6 3 7 4 
    # i = 2 -> 5 (실제로 인덱스 1)
    # j = 5 -> 3 (실제로 인덱스 4)
    # 5 2 6 3 -> 2 3 5 6 
    # k = 3 -> 5 (실제로 인덱스 2)
    # 인덱스는 commands로 들어온 값 - 1
    #-------------- 슬라이싱
    answer = []
    
    for command in commands:
        i, j, k = command
        
        sliced_arr = array[i-1 : j]
        
        sorted_arr = sorted(sliced_arr)
        answer.append(sorted_arr[k-1])
        
    return answer