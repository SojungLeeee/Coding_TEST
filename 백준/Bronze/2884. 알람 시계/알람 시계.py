h,m=input().split()
h=int(h)
m=int(m)

if h==0 and m<45:
    print("23 {0}".format(m-45+60))
elif h==0 and m>=45:
    print("{0} {1}".format(h,m-45))
elif h!=0 and m<45:
    print("{0} {1}".format(h-1, m-45+60))
elif h!=0 and m>=45:
    print("{0} {1}".format(h,m-45))