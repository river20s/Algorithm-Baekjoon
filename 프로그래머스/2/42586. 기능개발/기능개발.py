def solution(progresses, speeds):
    answer = []
    
    days = []
    for i in range(len(progresses)):
        remain = 100 - progresses[i]
        d = remain // speeds[i]
        if remain % speeds[i] != 0:
            d += 1
        days.append(d)
        
    base = days[0]
    count = 1
    
    for i in range(1, len(days)):
        if days[i] <= base:
            count += 1
        else:
            answer.append(count)
            base = days[i]
            count = 1
            
    answer.append(count)
        
    
    return answer