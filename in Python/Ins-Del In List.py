# creation of a list
li = list(map(int,input('Enter the elements in the list: ').split()))
print('list is',li)
# displaying of the list in ascending and descending order
print('ascending order',li)
li.sort()
print('descending order',li)
li.sort(reverse=True)
# insetion of the elements in the list
li.insert(2,23)
print('list is:',li)
li.append(14)
print('list is:',li)
li.extend((123,4,23,897))
print('list is',li)
# resizing the elemets of the list
l1 = li[2:-3]
print('resized list is',l1)
# replacement of the elements of the list
li[1] = (34,348,345)
print('list is:',li)
# deleting the elements of the list
li.remove(768)
print('list is:',li)
li.pop(3)
print('list is:',li)
# to delete all the elements of the list
li.clear()
print('list is:',li)
del li
# print('list is:',li)