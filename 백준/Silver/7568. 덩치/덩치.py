import sys
n=int(sys.stdin.readline())
xy_list=[]

for i in range(n):
    x,y=map(int,sys.stdin.readline().split())
    xy_list.append((x,y))

for weight_1 in xy_list:
    rank=1
    for weight_2 in xy_list:
        if weight_1[0]<weight_2[0] and weight_1[1]<weight_2[1]:
            rank=rank+1
    print(rank)