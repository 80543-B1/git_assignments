
def greatest(a,b,c):
    if (a>b and a>c):
        print(f"a {a} is greatest")
    elif b>c:
        print(f"b {b} is greatest")
    else:
        print(f"c {c} is greatest")


a = int(input("a : "))
b = int(input("b : "))
c = int(input("c : "))
greatest(a,b,c)