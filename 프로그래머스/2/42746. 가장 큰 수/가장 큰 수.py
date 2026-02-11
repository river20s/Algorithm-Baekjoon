def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key=lambda x: str(x)*3, reverse=True)
    answer = str(int(''.join(numbers)))
    return answer