import math
def divisor(num):
    c = 0
    square_root = int(math.sqrt(num))
    for i in range(1, square_root+1):
        if num % i == 0:
            c += 2
    if (square_root*square_root)==num:
        c -= 1
    return c
  
  def triangle(num):
    sum, temp, c = 0, 0, 1
    for x in range(1, num+1):
        sum += x
        if divisor(sum)>500:
            return sum
          
print(triangle(45000))
