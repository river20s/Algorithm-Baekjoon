from collections import deque

def solution(priorities, location):
    answer = 0
    
    q = deque()
    for i in range(len(priorities)):
        q.append((i, priorities[i]))
        
    count = 0
    
    
    while q:
        p = q.popleft()
        if q and p[1] < max(item[1] for item in q):
            q.append(p)
        else:
            count += 1
            if p[0] == location:
                return count
            
    answer = count
    
    return answer