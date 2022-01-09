li = list(map(int,input('Enter the elements in the list: ').split()))
pos1, pos2 = tuple(map(int,input('Enter the intial and final position').split()))
print('list is',li)
temp = li[pos1]
li[pos1] = li[pos2]
li[pos2] = temp
print('list is',li)
