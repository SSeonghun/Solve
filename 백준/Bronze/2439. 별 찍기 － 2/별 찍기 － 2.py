n = int(input())
count =1 
for i in range(n) :
    print(' '*(n-count), end ='')
    print('*'* count) 

    count+=1