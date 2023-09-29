dict = {}
main_dict = {}
for index in range(2):
    empid = int(input("Enter the employee id : "))
    emp_name = input("Enter the employee name : ")
    emp_dept = input("Enter the employee department : ")
    emp_salary = int(input("ENter the salary : "))
    years_of_exp = int(input("ENter employee exprience : "))

    main_dict = {
        "empid" : empid,
        "emp_name" : emp_name,
        "emp_dept" : emp_dept,
        "emp_salary" : emp_salary,
        "years_of_exp" : years_of_exp
    }
print(dict)