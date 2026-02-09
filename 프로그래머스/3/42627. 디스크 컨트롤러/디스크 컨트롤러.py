import heapq # 기본적으로 최소 힙 
def solution(jobs):
    jobs.sort()
    
    now = 0              # 현재 시각, 0ms부터 시작
    answer = 0           # 반환 시간 합계 (개수로 나눔)
    completed_jobs = 0   # 처리한 작업 개수
    i = 0                # jobs 인덱스
    
    wait_queue = []      # 대기 큐(최소 힙)
    
    # 모든 작업 처리할 때까지 반복:
    while completed_jobs < len(jobs):
        # now 이전에 들어온 모든 작업 대기 큐에 넣기
        while i < len(jobs) and jobs[i][0] <= now:
            heapq.heappush(wait_queue, [jobs[i][1], jobs[i][0]])
            i += 1

        # 대기 큐에서 꺼내기
        if wait_queue:
            # 대기 큐에 작업이 있다면
            # 소요 시간 짧은 것 꺼내기
            duration, req_time = heapq.heappop(wait_queue)
            now += duration             # 작업 끝난 시간으로 갱신
            answer += (now - req_time)  # 반환 시간 누적 (종료 시각 - 요청 시각)
            completed_jobs += 1         # 처리 작업 카운터 증가
            
        else:
            # 대기 큐가 비어 있다면 다음 작업 들어오는 시간으로 이동
            now = jobs[i][0]
    
    return answer // len(jobs)