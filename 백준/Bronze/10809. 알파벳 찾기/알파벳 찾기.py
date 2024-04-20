import sys

s=str(sys.stdin.readline())


strlist=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
         'q','r','s','t','u','v','w','x','y','z']

inputstr=[] #'baekjoon'

for i in range(len(s)):
    inputstr.append(s[i])

for i in strlist:
    if i in inputstr:
        print(inputstr.index(i), end=" ")
    else:
        print("-1", end=" ")
