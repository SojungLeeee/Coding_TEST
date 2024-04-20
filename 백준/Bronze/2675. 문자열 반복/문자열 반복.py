import sys

t=int(sys.stdin.readline())

for i in range(t):
    r,s=map(str,sys.stdin.readline().split())
    r=int(r)
    length=len(s)

    for i in range(length):
        for j in range(r):
            print(s[i], end="")
    print("")        
            