def solution(numbers, target):
    global answer
    n = len(numbers)
    answer = 0
    
    def dfs(num, Sum):
        global answer
        
        if num==n-1:
            if Sum == target:
                answer+=1
            return
        
        for i in range(2):
            numbers[num+1] = -numbers[num+1]
            Sum += numbers[num+1]
            dfs(num+1, Sum)
            Sum -= numbers[num+1]
    
    dfs(-1,0)
    return answer