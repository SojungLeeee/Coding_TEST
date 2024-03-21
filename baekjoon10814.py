import sys
n=int(sys.stdin.readline().strip())
online=[]
for i in range(n):
    age,name=sys.stdin.readline().split()
    online.append([int(age),name])

online.sort(key=lambda x:(x[0]))
for i in online:
    print(i[0],i[1])
