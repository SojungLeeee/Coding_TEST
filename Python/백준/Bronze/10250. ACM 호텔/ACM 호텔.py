import sys

t=int(sys.stdin.readline())

for i in range(t):
    h,w,n=map(int,sys.stdin.readline().split())

    floor=int(n%h)
    ho=int(n/h)+1

    if n%h==0:
        floor=h
        ho=ho-1

    floor=str(floor)

    if ho<10:
        ho=str(ho)
        print(floor+'0'+ho)
    else:
        ho=str(ho)
        print(floor+ho)
    # 1~6 : 1
    # 7~12 : 2
    # 13~18 : 3
    # 19~24 : 4
