array=[]
count=0

for i in range(10):
    n=int(input())
    if n%42 not in array:
        array.append(n%42)
        count=count+1
print(count)