def factorial(n):
    fact = 1
    a = n
    while(a>0):
        fact = fact * a
        a -= 1
    return fact
n = int(input('Enter a number: '))
if(n<0):
    print('pls enter a positive number')
else:
    print('Factorial of',n,'is: ',factorial(n))