n = int(input())

def abc(level,a):
    print(' ' * (n-1 - level), end='')
    print('*' * a)
    if level == n-1:
        return

    abc(level+1,a+2)
    print(' '*(n-1-level),end='')
    print('*'*a)

abc(0,1)

