1. Write a query to get unique department ID from employee
table.




mysql> select distinct(department_id) from employees;
+---------------+
| department_id |
+---------------+
|             0 |
|            10 |
|            20 |
|            30 |
|            40 |
|            50 |
|            60 |
|            70 |
|            80 |
|            90 |
|           100 |
|           110 |
+---------------+
12 rows in set (0.00 sec)


****************************************************************************


2. Write a query to get all employee details from the employee
table order by first name, descending.




select * from employees order by first_name;


*************************************************************

3. Write a query to get the employee ID, names (first_name,
last_name), salary in ascending order of salary.




select employee_id ,concat(first_name ," ", last_name) as Names , salary from employees order by salary;


***************************************************************

4. Display first name and join date of the employees who is
either IT Programmer or Sales Man.


mysql> select first_name , hire_date ,job_id FROM employees where job_id in ("SA_MAN","IT_PROG");
+------------+------------+---------+
| first_name | hire_date  | job_id  |
+------------+------------+---------+
| Alexander  | 1987-06-20 | IT_PROG |
| Bruce      | 1987-06-21 | IT_PROG |
| David      | 1987-06-22 | IT_PROG |
| Valli      | 1987-06-23 | IT_PROG |
| Diana      | 1987-06-24 | IT_PROG |
| John       | 1987-08-01 | SA_MAN  |
| Karen      | 1987-08-02 | SA_MAN  |
| Alberto    | 1987-08-03 | SA_MAN  |
| Gerald     | 1987-08-04 | SA_MAN  |
| Eleni      | 1987-08-05 | SA_MAN  |
+------------+------------+---------+
10 rows in set (0.00 sec)



*****************************************************************


5.Display details of employee with ID 150 or 160.



mysql> select * from employees where employee_id in (150 , 160);
+-------------+------------+-----------+---------+--------------------+------------+--------+----------+----------------+------------+---------------+
| EMPLOYEE_ID | FIRST_NAME | LAST_NAME | EMAIL   | PHONE_NUMBER       | HIRE_DATE  | JOB_ID | SALARY   | COMMISSION_PCT | MANAGER_ID | DEPARTMENT_ID |
+-------------+------------+-----------+---------+--------------------+------------+--------+----------+----------------+------------+---------------+
|         150 | Peter      | Tucker    | PTUCKER | 011.44.1344.129268 | 1987-08-06 | SA_REP | 10000.00 |           0.30 |        145 |            80 |
|         160 | Louise     | Doran     | LDORAN  | 011.44.1345.629268 | 1987-08-16 | SA_REP |  7500.00 |           0.30 |        146 |            80 |
+-------------+------------+-----------+---------+--------------------+------------+--------+----------+----------------+------------+---------------+
2 rows in set (0.00 sec)




*******************************************************************************************************************


6. Display first name, salary, commission pct, and hire date for
employees with salary less than 10000.



mysql> select first_name , salary , commission_pct , hire_date from employees where  salary < 10000 limit 5;
+------------+---------+----------------+------------+
| first_name | salary  | commission_pct | hire_date  |
+------------+---------+----------------+------------+
| Alexander  | 9000.00 |           0.00 | 1987-06-20 |
| Bruce      | 6000.00 |           0.00 | 1987-06-21 |
| David      | 4800.00 |           0.00 | 1987-06-22 |
| Valli      | 4800.00 |           0.00 | 1987-06-23 |
| Diana      | 4200.00 |           0.00 | 1987-06-24 |
+------------+---------+----------------+------------+
5 rows in set (0.00 sec)


***********************************************************************


7. Display employees where the first name or last name starts
with S.


mysql> select first_name , last_name from employees where first_name like "S%" or last_name like "S%";
+------------+-----------+
| first_name | last_name |
+------------+-----------+
| Sundar     | Ande      |
| Shelli     | Baida     |
| Sarah      | Bell      |
| Shelley    | Higgins   |
| Steven     | King      |
| Sundita    | Kumar     |
| Steven     | Markle    |
| Susan      | Mavris    |
| Samuel     | McCain    |
| Nandita    | Sarchand  |
| Ismael     | Sciarra   |
| John       | Seo       |
| Sarath     | Sewall    |
| Lindsey    | Smith     |
| William    | Smith     |
| Stephen    | Stiles    |
| Martha     | Sullivan  |
| Patrick    | Sully     |
| Sigal      | Tobias    |
| Shanta     | Vollman   |
+------------+-----------+
20 rows in set (0.00 sec)


*************************************************************************

8. Display details of jobs in the descending order of the title.


mysql> SELECT distinct job_id from employees order by job_id desc;
+------------+
| job_id     |
+------------+
| ST_MAN     |
| ST_CLERK   |
| SH_CLERK   |
| SA_REP     |
| SA_MAN     |
| PU_MAN     |
| PU_CLERK   |
| PR_REP     |
| MK_REP     |
| MK_MAN     |
| IT_PROG    |
| HR_REP     |
| FI_MGR     |
| FI_ACCOUNT |
| AD_VP      |
| AD_PRES    |
| AD_ASST    |
| AC_MGR     |
| AC_ACCOUNT |
+------------+
19 rows in set (0.00 sec)



*********************************************************************



9. Display details of the employees where commission percentage
is null and salary in the range 5000 to 10000 and department is
30.



select * from employees where commission_pct is null and salary > 5000 and salary < 10000 and department_id = 30;

empty set 


*******************************************************************


10. Display employees first_name,email who are working in
“Executive” department.


select first_name , email from employees where department_id = 90;
+------------+----------+
| first_name | email    |
+------------+----------+
| Steven     | SKING    |
| Neena      | NKOCHHAR |
| Lex        | LDEHAAN  |
+------------+----------+
3 rows in set (0.00 sec)




*************************************************************************


11 . Display unique contry_id from locations table.


select distinct country_id from locations;
+------------+
| country_id |
+------------+
| "          |
| AU         |
| BR         |
| CA         |
| CH         |
| CN         |
| DE         |
| IN         |
| IT         |
| JP         |
| NL         |
| Ox         |
| SG         |
| UK         |
| US         |
+------------+
15 rows in set (0.00 sec)


***************************************************************


12. Display all employees whose have job_id IT_PROG and
FI_ACCOUNT.


mysql> select concat(first_name , " " , last_name ) as Names from employees where job_id in ("IT_PROG","F1_ACCOUNT");
+------------------+
| Names            |
+------------------+
| Alexander Hunold |
| Bruce Ernst      |
| David Austin     |
| Valli Pataballa  |
| Diana Lorentz    |
+------------------+
5 rows in set (0.00 sec)


*********************************************************************

13. Display all countries in ascending order.

mysql> select country_name from countries 
    -> order by country_name;
+--------------------------+
| country_name             |
+--------------------------+
| Argentina                |
| Australia                |
| Belgium                  |
| Brazil                   |
| Canada                   |
| China                    |
| Denmark                  |
| Egypt                    |
| France                   |
| Germany                  |
| HongKong                 |
| India                    |
| Israel                   |
| Italy                    |
| Japan                    |
| Kuwait                   |
| Mexico                   |
| Netherlands              |
| Nigeria                  |
| Singapore                |
| Switzerland              |
| United Kingdom           |
| United States of America |
| Zambia                   |
| Zimbabwe                 |
+--------------------------+
25 rows in set (0.00 sec)






















