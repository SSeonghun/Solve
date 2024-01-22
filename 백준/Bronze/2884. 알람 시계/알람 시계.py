h, y = map(int, input().split())

if y >= 45 :
    b = y-45
if y < 45 :
    b = 60+y-45
if y >= 45 :
    a = h
if y < 45 and h >= 1:
    a = h-1
if y < 45 and h ==0 :
    a = 23

print(a, b)