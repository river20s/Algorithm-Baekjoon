def solution(citations):
    # citations 내림차순 정렬
    citations.sort(reverse=True)
    answer = 0
    # index + 1 값이랑 비교
    for i, citation in enumerate(citations):
        if citation >= i + 1:
            answer = i + 1
            # 값이 index + 1보다 크거나 같으면 answer 갱신
        else:
            break
        # index + 1보다 값 작으면 끝내기 
    
    return answer