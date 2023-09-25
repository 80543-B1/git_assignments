# Write a Python program to sort a list of tuples using Lambda.
# Original list of tuples:
# [('Python', 88), ('ML', 90), ('Rprograming', 97), ('DBMS', 82)]
# Sorting the List of Tuples:
# [('DBMS', 82), ('Python', 88), ('ML', 90), ('Rprograming', 97)]

L = [('Python', 88), ('ML', 90), ('Rprograming', 97), ('DBMS', 82)]
# L = dict(L)
print(L)
L.sort(key=lambda x : x[1])
print(L)