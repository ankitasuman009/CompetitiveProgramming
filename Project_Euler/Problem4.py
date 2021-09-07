import numpy as np
# function to check palindrome
def checkPalindrome(num):
  temp = num
  rev = 0
  
  while temp != 0:
    rev=(rev * 10)+(temp % 10)
    temp=temp//10
 
  if num==rev:
    return True
  return False

#generating product of all pairs of 3 digit numbers
set_num=[]
for i in range(100,1000):
  for j in range (100,1000):
    set_num.append(i*j)
#check for palindrome and save in new set
pali_set=[]
max1 = -1
for i in set_num:
  if checkPalindrome(i)==True:
    pali_set.append(i)
#     if max1<i:
#         max1 = i

# pali_set2 = np.sort(pali_set)
# print(pali_set2[len(pali_set2)-1])

# list.sort(pali_set)

pali_set.sort()
pali_set[len(pali_set)-1]
