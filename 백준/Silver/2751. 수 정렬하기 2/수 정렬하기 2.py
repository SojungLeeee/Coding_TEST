import sys

m_list=[]
n=int(sys.stdin.readline())
for i in range(n):
    m=int(sys.stdin.readline())
    m_list.append(m)

m_list=list(set(m_list))
msort_list=sorted(m_list)

for i in msort_list:
    print(i)
