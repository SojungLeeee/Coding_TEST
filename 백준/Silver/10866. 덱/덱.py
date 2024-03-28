import sys
n=int(sys.stdin.readline().strip())
deck=[]

for i in range(n):
    command=list(sys.stdin.readline().split())

    if command[0]=='push_front':
        deck.insert(0,(int(command[1])))
        # print(deck) 잘들어가는지 확인용

    elif command[0]=='push_back':
        deck.append(int(command[1]))
        # print(deck) 확인용

    elif command[0]=='pop_front':
        if deck:
            print(deck.pop(0))
        else:
            print('-1')
    
    elif command[0]=='pop_back':
        if deck:
            print(deck.pop())
        else:
            print('-1')

    elif command[0]=='size':
        print(len(deck))
    
    elif command[0]=='empty':
        if deck:
            print('0')
        else:
            print('1')

    elif command[0]=='front':
        if deck:
            print(deck[0])
        else:
            print('-1')

    elif command[0]=='back':
        if deck:
            print(deck[-1])
        else:
            print('-1')

    