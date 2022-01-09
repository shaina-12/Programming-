a, b, c = tuple(map(int,input('Enter the three numbers: ').split()))
# smallest number
print('The smallest numbers are: ')
if(a<=b and a<=c):
    print(a)
elif(b<=a and b<=c):
    print(b)
else:
    print(c)
# largest number
print('The largest numbers are: ')
if(a>=b and a>=c):
    print(a)
elif(b>=a and b>=c):
    print(b)
else:
    print(c)
