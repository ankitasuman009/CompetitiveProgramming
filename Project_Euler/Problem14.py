def longestChain(num):
    c = 0
    while num!=1:
        num = num//2 if num%2==0 else (3*num)+1
        c += 1
    return c+1
  
max, num = 0, 0
for i in range(1, 1000000):
    ret = longestChain(i)
    if ret>max:
        num = i
        max = ret
print(num)
