import sys
sum=0
count=0

l=int(sys.stdin.readline())
words=['a','b','c','d','e','f','g','h','i','j','k','l',
       'm','n','o','p','q','r','s','t','u','v','w','x','y','z']
words_num=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
           21,22,23,24,25,26]

sentence=sys.stdin.readline().strip()

for i in sentence:
    for j in words:
        if i==j:
            check_index=words.index(j)
            check_words_num=words_num[check_index]
            sum+=check_words_num*(31**(count))
            count+=1

print(sum)