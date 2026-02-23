def solution(answers):
    s1 = [1, 2, 3, 4, 5] * 2000 # 길이 5
    s2 = [2, 1, 2, 3, 2, 4, 2, 5] * 1250 # 길이 8
    s3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] * 1000 # 길이 10
    
    s1_score = s2_score = s3_score = 0
    
    for i in range(len(answers)):
        if s1[i] == answers[i]:
            s1_score += 1
        if s2[i] == answers[i]:
            s2_score += 1
        if s3[i] == answers[i]:
            s3_score += 1
        
    max_val = max(s1_score, s2_score, s3_score)
    answer = []
    
    if s1_score == max_val: answer.append(1)
    if s2_score == max_val: answer.append(2)
    if s3_score == max_val: answer.append(3)
    
    return answer

            
