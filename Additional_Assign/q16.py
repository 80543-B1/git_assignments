n = int(input("Enter no of elements : "))
list1 = []
flag = True
for index in range(n):
    index = int(input("element : "))
    list1.append(index)
print(f"list is : {list1}")

for i in range(len(list1)):
    for j in range(2,list1[i]//2):
        if list1[i] % j == 0:
            flag = False
            break
if flag == True:
    print(True)
else:
    print(False)