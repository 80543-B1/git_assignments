digit = int(input("ENter the 4 digit "))
num = digit
if digit<1000 and digit>9999:
    print("Wrong input")
else:
    #face value
    digit1 = num%10
    num = num//10
    digit2 = num%10
    num = num//10
    digit3 = num%10
    num = num//10
    digit4 = num%10
    num = num//10

    print(f"Face value : {digit4} {digit3} {digit2} {digit1} ")

    #place value
    print(f"{digit} : {digit4*1000} + {digit3*100} + {digit2*10} + {digit4*1}  ")

    #reverse digit
    print("Reverse num is : ",end='')
    num = digit
    while num>0:
        rem = num%10
        print(rem,end='')
        num=num//10





