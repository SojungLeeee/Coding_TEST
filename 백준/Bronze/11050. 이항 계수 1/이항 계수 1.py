import sys

n,k=map(int,sys.stdin.readline().split())
result=1

for i in range(k):
    result=result*(n-i)


for i in range(1,k+1):
    result=int(result/i)

print(result)