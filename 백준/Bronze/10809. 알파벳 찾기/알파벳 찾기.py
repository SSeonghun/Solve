s = input()
# 97 122
lst = [-1]*26

for i in range(len(s)):
    if lst[ord(s[i])-97] != -1:
        continue
    lst[ord(s[i])-97] = i

print(*lst)