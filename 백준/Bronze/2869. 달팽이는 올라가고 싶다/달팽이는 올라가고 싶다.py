import sys

a,b,v=map(int,sys.stdin.readline().split())

#a : 달팽이가 낮에 올라가는 미터 (+)
#b : 달팽이가 밤에 미끄러지는 미터 (-)
#v : 달팽이가 올라야 할 나무의 높이 V

# now=0
# day=1

# while(1):
#     #now=a 낮에 a만큼 올라감
#     now+=a
#     if now<v: #현재 높이가 v보다 아래라면
#         now-=b #b 높이만큼 미끄러진다.
#         day+=1
#     else:
#         print(day)
#         break


#문제의 제한시간이 0.25초 -> 반복문을 사용하면 안됨..

#하루에 올라갈 수 있는 거리 : a-b
#식을 세워보면 (x=day)
#Ax - B(x-1) = V
#Ax - Bx + B = V
#x(A-B) = V-B
# x = (V-B) / (A-B)

day = (v-b) / (a-b)
if day==int(day):
    print(int(day))
else:
    print(int(day)+1)