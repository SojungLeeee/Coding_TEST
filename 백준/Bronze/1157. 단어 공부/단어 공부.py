words=input().upper()
words_set=set(words)
unique_word=list(words_set)
words_countlist=[]

for i in unique_word:
    count=words.count(i)
    words_countlist.append(count)

maxword=max(words_countlist)

if words_countlist.count(maxword)>1:
    print("?")
else:
    max_index=words_countlist.index(maxword)
    print(unique_word[max_index])

