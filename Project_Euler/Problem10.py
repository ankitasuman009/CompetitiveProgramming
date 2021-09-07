import math
def is_prime(num):
    if num == 1:
        return False
    if num == 2:
        return True
    for n in range(2, int(math.sqrt(num))+1):
        if num%n==0:
            return False
    return True
    
    
c = 0
for i in range(1, 2000001):
    if is_prime(i):
        c += i
print(c)
