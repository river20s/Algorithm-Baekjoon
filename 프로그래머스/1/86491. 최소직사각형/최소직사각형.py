def solution(sizes):
    widths = []
    heights = []
    
    for size in sizes:
        w, h = max(size), min(size)
        widths.append(w)
        heights.append(h)
        
    
    answer = max(widths) * max(heights)
    return answer