def check(x):
    x2 = math.floor(math.sqrt(x))
    for i in range(2, x2+1):
        if x%i==0:
            return False
    return True


import math
num = 600851475143
prime_no = 0
n = math.floor(math.sqrt(num))
for x in range(2, n):
    if num%x==0 and check(x):
        prime_no = x 
        
print(prime_no)
