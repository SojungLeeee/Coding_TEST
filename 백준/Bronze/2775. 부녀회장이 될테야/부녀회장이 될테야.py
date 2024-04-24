import sys
cnt_list=[1,2,3]

t=int(sys.stdin.readline()) #테스트케이스 수
for i in range(t):

    k=int(sys.stdin.readline()) #몇 층인지
    n=int(sys.stdin.readline()) #몇 호인지
    people=[]
    #0층의 1호에는 1명이 산다.
    #0층의 2호에는 2명이 산다.
    #1층의 3호에는 3명이 산다.
    #-> 1층 1호 - 1명 / 1층 2호 - 3명
    #-> 1층의 3호에 살려면 0층의 1,2,3호 인원인 6명을 데려와 살아야한다.
    #-> 2층 1호 - 1명 / 2층 2호 - 4명 / 2층 3호 - 10명
    for j in range(1,n+1):
        people.append(j)
    
    for z in range(k): #층수만큼 반복
        for zz in range(1,n): #호수만큼 반복
            people[zz]=people[zz]+people[zz-1]
            # print(people) 배열에 잘 들어가고있는지 확인용

    print(people[-1])