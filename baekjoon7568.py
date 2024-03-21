import sys
n=int(sys.stdin.readline().strip())
whlist=[]
ans=[]

for i in range(n):
    x,y=map(int, sys.stdin.readline().strip().split())
    whlist.append((x,y))

for size in whlist: #size는 (x,y) 쌍으로 나옴
    rank=1
    for compare in whlist:  #compare 도 (x,y)쌍
        if size[0]<compare[0] and size[1]<compare[1]:
            rank=rank+1 #순위를 높임
    print(rank,end =" ")
