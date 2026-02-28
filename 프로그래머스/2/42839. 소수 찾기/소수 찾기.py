from itertools import permutations

def solution(numbers):
    answer = 0
    num_set = set()
    for i in range(1, len(numbers) + 1):
        
        # permutations(리스트, 뽑을 개수)
        for p in permutations(numbers, i):
            num = int("".join(p))
            num_set.add(num)
            
    for n in num_set:
        if n < 2:
            continue
        
        is_prime = True
        for i in range(2, int(n**0.5) + 1):
            if n % i == 0:
                is_prime = False
                break
                
        if is_prime:
            answer += 1
            
    
    return answer