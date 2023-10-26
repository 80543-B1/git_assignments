1. Write a query that produces all rows from the Customers table
for which the salesperson’s number is 1001.



SELECT * FROM CUSTOMERS;
ERROR 1146 (42S02): Table 'sales.CUSTOMERS' doesn't exist
mysql> SELECT * FROM customers;
+------+----------+----------+--------+------+
| cnum | cname    | city     | rating | snum |
+------+----------+----------+--------+------+
| 2001 | Hoffman  | London   |    100 | 1001 |
| 2002 | Giovanni | Rome     |    200 | 1003 |
| 2003 | Liu      | San Jose |    200 | 1002 |
| 2004 | Grass    | Berlin   |    300 | 1002 |
| 2006 | Clemens  | London   |    100 | 1001 |
| 2008 | Cisneros | San Jose |    300 | 1007 |
| 2007 | Pereira  | Rome     |    100 | 1004 |
+------+----------+----------+--------+------+
7 rows in set (0.00 sec)

mysql> SELECT * FROM customers
    -> where snum = 1001;
+------+---------+--------+--------+------+
| cnum | cname   | city   | rating | snum |
+------+---------+--------+--------+------+
| 2001 | Hoffman | London |    100 | 1001 |
| 2006 | Clemens | London |    100 | 1001 |
+------+---------+--------+--------+------+
2 rows in set (0.00 sec)

***************************************************************************************************************************

2. Write a select command that produces the rating followed by
the name of each customer in San Jose.


SELECT rating , cname , city  FROM customers where city = "San Jose";
+--------+----------+----------+
| rating | cname    | city     |
+--------+----------+----------+
|    200 | Liu      | San Jose |
|    300 | Cisneros | San Jose |
+--------+----------+----------+
2 rows in set (0.00 sec)




***************************************************************************************************************************



3. Write a query that will produce the snum values of all
salespeople from the Orders table (with the duplicate values
suppressed).


mysql> select distinct snum from orders;
+------+
| snum |
+------+
| 1007 |
| 1001 |
| 1004 |
| 1002 |
| 1003 |
+------+
5 rows in set (0.00) 

**********************************************************************************************************************

4.  Write a query that will give you all orders for more than Rs.
1,000.


mysql> select * from orders where amt>1000;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
6 rows in set (0.00 sec)



*******************************************************************************************************************
5 Write a query that will give you the names and cities of all
salespeople in London with a commission above 0.10.


select sname,city from salespeople
    -> where city = "London" and comm>0.10;
+--------+--------+
| sname  | city   |
+--------+--------+
| Peel   | London |
| Motika | London |
+--------+--------+
2 rows in set (0.00 sec)



******************************************************************************************************************

6. Write a query on the Customers table whose output will
exclude all customers with a rating <= 100, unless they are
located in Rome.




mysql> select * from customers where rating>=100 or city = "Rome";
+------+----------+----------+--------+------+
| cnum | cname    | city     | rating | snum |
+------+----------+----------+--------+------+
| 2001 | Hoffman  | London   |    100 | 1001 |
| 2002 | Giovanni | Rome     |    200 | 1003 |
| 2003 | Liu      | San Jose |    200 | 1002 |
| 2004 | Grass    | Berlin   |    300 | 1002 |
| 2006 | Clemens  | London   |    100 | 1001 |
| 2008 | Cisneros | San Jose |    300 | 1007 |
| 2007 | Pereira  | Rome     |    100 | 1004 |
+------+----------+----------+--------+------+
7 rows in set (0.00 sec)



******************************************************************************************************************


7. What will be the output from the following query?
Select * from Orders where (amt < 1000 OR NOT (odate = ‘1990-10-
03’ AND cnum > 2003));


Select * from orders where (amt < 1000 OR NOT (odate = '1990-10-03' AND cnum > 2003));
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
8 rows in set (0.00 sec)


*********************************************************************************************************************

8. 8. What will be the output of the following query?
Select * from Orders
where NOT ((odate = ‘1990-10-03’ OR snum >1006) AND amt >=
1500);


select * from orders  where not (odate = '1990-10-03' or snum>1006) and amt>=1500;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
3 rows in set (0.00 sec)




**************************************************************************************************************************

9.What is a simpler way to write this query?
Select snum, sname, city, comm from Salespeople
Where (comm >= .12 or comm <= .14);


select * from salespeople;
+------+---------+-----------+------+
| snum | sname   | city      | comm |
+------+---------+-----------+------+
| 1001 | Peel    | London    | 0.12 |
| 1002 | Serres  | San Jose  | 0.13 |
| 1004 | Motika  | London    | 0.11 |
| 1007 | Rifkin  | Barcelona | 0.15 |
| 1003 | Axelrod | New York  | 0.10 |
+------+---------+-----------+------+
5 rows in set (0.00 sec)





***************************************************************************************************************************x


10. Write a query that selects all orders except those with
zeroes or NULLs in the amt field.


select * from orders where amt = 0 or amt = null;
Empty set (0.00 sec)

