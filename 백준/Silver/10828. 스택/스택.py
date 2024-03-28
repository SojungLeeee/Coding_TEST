import sys
n=int(sys.stdin.readline().strip())
stack=[]

for i in range(n):
    command=list(sys.stdin.readline().split())

    if command[0]=='push':
        stack.append(int(command[1]))

    elif command[0]=='pop':
        if stack:
            print(stack.pop(-1)) #.pop 자체가 가장 뒤의 원소를 빼는 것이므로 pop(-1)을 할 필요가 없음. pop()으로도 충분
        else:
            print('-1')

    elif command[0]=='size':
        print(len(stack))

    elif command[0]=='empty':
        if stack:
            print('0')
        else:
            print('1')

    elif command[0]=='top':
        if stack:
            print(stack[-1])
        else:
            print('-1')



        
