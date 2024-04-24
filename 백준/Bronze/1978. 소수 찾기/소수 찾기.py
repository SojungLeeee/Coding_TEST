import sys

n=int(sys.stdin.readline())
n_list=list(map(int,sys.stdin.readline().split()))
count=0

for num in n_list:
    if num==1:
        count+=1
    else:
        for i in range(2,num):
            if num%i==0:
                count+=1
                break

print(len(n_list)-count)

