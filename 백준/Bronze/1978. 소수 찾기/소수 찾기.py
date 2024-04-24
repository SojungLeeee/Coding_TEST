n=int(input())
num_list=list(map(int,input().split()))
sosu=0
for num in num_list: #리스트 내 원소 목록 차례대로 불러오기
    if num>1: #만약 원소가 1보다 크다면 (1은 소수x)
        for i in range(2,num): #나누는 수를 2부터 num-1까지 돌도록
            if num%i==0: #만약 원소가 2~num-1수로 나누어지면
                break
        else:
            sosu+=1
print(sosu)
