list1 = [1,4,5,2]
print(list1)
for i in range(len(list1)):
    fact = 1
    for j in range(1,list1[i]+1):
        fact = fact * j
    print(f"fact of {list1[i]} is : {fact} ")
