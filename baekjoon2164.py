from collections import deque #deque 가져오기
import sys
n=int(sys.stdin.readline().strip())
queue=deque()
queue=deque(range(1,n+1))

while len(queue)!=1:
    queue.popleft()
    queue.append(queue.popleft())
    #queue.rotate(-1)하면 왼쪽으로 한칸씩이동, 제일왼쪽 -> 제일 오른쪽으로

print(queue[0])
#deque는 시작점의 값을 넣고 빼거나, 끝 점의 값을 넣고 빼는데 최적화된 연산 속도를 제공
#대부분의 경우 deque는 list보다 좋은 옵션/ push*pop연산이 많을 경우 더 좋은 속도

