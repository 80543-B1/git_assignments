age = int(input("Enter the age : "))

if age<0 and age>120:
    print("ENter the a valid age")
elif age<18:
    print("You are not eligible for voting")
else:
    print("You can vote")