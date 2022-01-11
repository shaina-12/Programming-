# Dictionary
# Create a dictionary

thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print(thisdict)

# Accessing elements
# get the value of the model key

X= thisdict.get("model")
print(X)

# another Method
X= thisdict["model"]
print(X)

# Change Values of a specific item by referring to its key name
# Change the year to 2018
thisdict["year"] =2018
print(thisdict)

# Dictionart length using len() function
print(len((thisdict)))


#remove an item from a dictionary if it is present.
# check if item is present 
if "model" in thisdict:
  print("Yes, 'model' is one of the keys in the thisdict dictionary")
# removing item using pop()
thisdict.pop("model")
print(thisdict)

# del method to delete
del thisdict["brand"]
print(thisdict)

# Add a key to a dictionary.
thisdict["color"] = "red"
thisdict["model"] = "mustang"
thisdict["brand"] = "ford"
print(thisdict)

# concatenate  dictionaries to create a new one.
def Merge(dict1, dict2): 
    return(dict2.update(dict1)) 
      
# Driver code 
dict1 = {'a': 10, 'b': 8} 
dict2 = {'d': 6, 'c': 4} 
  
# This return None 
print(Merge(dict1, dict2)) 
  
# changes made in dict2 
print(dict2) 

