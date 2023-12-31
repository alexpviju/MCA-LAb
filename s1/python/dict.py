def merge(dict1,dict2):
    return (dict2.update(dict1))
dict1={'a':1,'c':2}
dict2={'c':6,'d':9}
print(merge(dict1,dict2))
print(dict2)