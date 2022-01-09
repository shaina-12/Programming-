import string
str = input('Enter the string: ')
ctr = 0
for s in str:
    if(s == 'a' or s == 'A' or s == 'e' or s == 'E' or 
    s == 'i' or s == 'I' or s == 'o' or s == 'O'or s == 'u' or s == 'U'):
        ctr = ctr + 1
print('No of vowels are:',ctr)