import sys

n=int(sys.stdin.readline())
xy_list=[]

for i in range(n):
    x,y=map(int,sys.stdin.readline().split())
    xy_list.append((x,y))

xy_list=sorted(xy_list)

for i in xy_list:
    print(i[0], i[1])