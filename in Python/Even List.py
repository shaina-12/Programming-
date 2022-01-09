li = list(map(int,input('Enter the elements in the list: ').split()))
li1 = []
for i in li:
    if(i%2 == 0):
        li1.append(i)
print('Even element of the given list is:',li1)
