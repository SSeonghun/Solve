n, m = map(int, input().split())
name = list(map(int, input().split()))

def abc(level,Sum,st):
    global Max
    if level==3:
        if Max < Sum and Sum <= m:
            Max = Sum
        return


    for i in range(st,n):
        abc(level+1,Sum+name[i],i+1)


Max = -21e8
abc(0,0,0)
print(Max)