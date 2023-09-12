# Write a program that prompts the user to input number of calls and
# calculate the monthly telephone bills
# as per the following rule:
# Minimum Rs. 200 for up to 100 calls.
# Plus Rs. 0.60 per call for next 50 calls.
# Plus Rs. 0.50 per call for next 50 calls.
# Plus Rs. 0.40 per call for any call beyond 200 calls

calls = int(input("AMount of calls you had : "))
if calls<=100:
    print("Your bill is : 200 ")
elif calls <= 150:
    add_charges = 200 + ((calls-100)*0.60)
    print(f"Your total bill is : {add_charges}")
elif calls <=200:
    add_charges = 200 + (0.60*50) +((calls - 150) * 0.50)
    print(f"Your total bill is : {add_charges}")
else:
    add_charges = 200 + (0.60*50) + (0.50*50) + (calls-200)*0.40
    print(f"Your total bill is : {add_charges}")
