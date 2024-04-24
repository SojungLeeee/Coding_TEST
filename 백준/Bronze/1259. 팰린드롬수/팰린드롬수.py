while 1:

    words=input()
    if words=="0":
        break
    words_reverse=words[::-1]
    # print(words)
    # print(words_reverse)
    if words==words_reverse:
        print("yes")
    else:
        print("no")
