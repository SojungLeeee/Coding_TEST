import sys
n=int(sys.stdin.readline())

cards=list(map(int,sys.stdin.readline().split()))

m=int(sys.stdin.readline())

cards_hit=list(map(int,sys.stdin.readline().split()))

dic={}

for i in cards: #cards배열에 요소 반복
    if i in dic: #만약 요소가 이미 dic안에 들어가있다면
        dic[i]+=1 #값 +1
    else: #요소가 dic안에 없다면
        dic[i]=1 #i(요소)번째 키값=1

for i in cards_hit: #cards_hit 요소 중
    if i in dic: #요소가 dic안에 들어가있다면
        print(dic[i], end=" ") #값을 출력
    else: #없으면
        print(0, end=" ") #0출력


#아래는 시간초과
# import sys
# n=int(sys.stdin.readline())

# cards=list(map(int,sys.stdin.readline().split()))

# m=int(sys.stdin.readline())

# cards_hit=list(map(int,sys.stdin.readline().split()))
# correct_list=[]

# count=0

# for i in cards_hit:
#     for j in cards:
#         if j==i:
#             count+=1
#     print("{}".format(count), end=" ")
#     count=0
            
