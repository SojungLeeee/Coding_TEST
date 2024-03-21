import sys
n=int(sys.stdin.readline().strip())
arr=[]
for i in range(n):
    x,y=map(int, sys.stdin.readline().split()) #i번점의 위치 x_i y_i
    arr.append([x,y])

arr.sort(key=lambda x:(x[0],x[1])) #0번째 인덱스가 동일할때 1번째 인덱스를 오름차순으로 정리
#x[1]앞에 -를 붙일 경우 0번째 인덱스가 동일할 때 1번째 인덱스를 내림차순으로 정렬

for i in arr:
    print(i[0],i[1])

