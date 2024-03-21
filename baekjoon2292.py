import sys
n=int(sys.stdin.readline().strip())
beehouse=1 #벌집개수
cnt=1

while n>beehouse: #if n이 13이면 / n=13, beehouse=7 계속 / n=13, beehouse=19 -> 그만 탈출
    beehouse=beehouse+cnt*6 #beehouse=1+1*6=7 / beehouse=7+2*6=19
    cnt=cnt+1 #cnt=2 #cnt=3

print(cnt) #cnt=3
