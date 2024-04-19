num_list=['0','1','2','3','4','5','6','7','8','9']
a=int(input())
b=int(input())
c=int(input())
multiple=a*b*c
multiple=str(multiple)

multiple_countlist=[]
multiple_list=list(multiple)
multiple_set=set(multiple_list)

for i in num_list:
    count=multiple_list.count(i)
    multiple_countlist.append(count)

for i in range(10):
    print(multiple_countlist[i])

# print(multiple_list)
# print(num_list)
# print(multiple_countlist)