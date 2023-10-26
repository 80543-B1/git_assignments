show databases;
+--------------------+
| Database           |
+--------------------+
| classwork_db       |
| dbda_db            |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
6 rows in set (0.00 sec)

mysql> create database spj;
Query OK, 1 row affected (0.45 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| classwork_db       |
| dbda_db            |
| information_schema |
| mysql              |
| performance_schema |
| spj                |
| sys                |
+--------------------+
7 rows in set (0.00 sec)

mysql> use spj;
Database changed


mysql> insert into  S values("S1","SMITH",20,"London");
Query OK, 1 row affected (0.43 sec)

mysql> insert into  S values("S2","JONES",10,"PARIS"),("")
    -> ;
ERROR 1136 (21S01): Column count doesn't match value count at row 2
mysql> insert into  S values("S2","JONES",10,"PARIS")
    -> ,("S3","Blake",30,"Paris"),
    -> ("S4","Clark",20,"London"),
    -> ("S5","Adams",30,"Athens");
Query OK, 4 rows affected (0.17 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from s;
ERROR 1146 (42S02): Table 'spj.s' doesn't exist
mysql> select * from S;
+----+-------+--------+--------+
| S# | Sname | status | city   |
+----+-------+--------+--------+
| S1 | SMITH |     20 | London |
| S2 | JONES |     10 | PARIS  |
| S3 | Blake |     30 | Paris  |
| S4 | Clark |     20 | London |
| S5 | Adams |     30 | Athens |
+----+-------+--------+--------+
5 rows in set (0.00 sec)








mysql> create table P (`P#` CHAR(5) NOT NULL ,Pname CHAR(20) , color CHAR(6),weight SMALLINT,city CHAR(15));
Query OK, 0 rows affected (0.53 sec)

mysql> insert into  P values("P1","Nut","Red",12,"London"),
    -> ("P2","Bolt","Green",17,"Paris"),
    -> ("P3","Screw","Blue",17,"Rome"),
    -> ("P4","Screw","Red",14,"London"),
    -> ("P5","Cam","Blue",12,"Paris"),
    -> ("P6","Cog","Red",19,"London");
Query OK, 6 rows affected (0.19 sec)
Records: 6  Duplicates: 0  Warnings: 0

mysql> select * from P;
+----+-------+-------+--------+--------+
| P# | Pname | color | weight | city   |
+----+-------+-------+--------+--------+
| P1 | Nut   | Red   |     12 | London |
| P2 | Bolt  | Green |     17 | Paris  |
| P3 | Screw | Blue  |     17 | Rome   |
| P4 | Screw | Red   |     14 | London |
| P5 | Cam   | Blue  |     12 | Paris  |
| P6 | Cog   | Red   |     19 | London |
+----+-------+-------+--------+--------+
6 rows in set (0.00 sec)





create table J (`J#` CHAR(4) NOT NULL ,Jname CHAR(10) ,city CHAR(15));
Query OK, 0 rows affected (2.01 sec)

mysql> insert into  J Values("J1","Sorter","Paris"),
    -> ("J2","Punch","Rome"),
    -> ("J3" , "Reader","Athens"),
    -> ("J4","Console","Athens"),
    -> ("J5","Collator","London"),
    -> ("J6","Terminal","Oslo"),
    -> ("J7","Tape","London");
Query OK, 7 rows affected (1.22 sec)
Records: 7  Duplicates: 0  Warnings: 0

mysql> select * from J;
+----+----------+--------+
| J# | Jname    | city   |
+----+----------+--------+
| J1 | Sorter   | Paris  |
| J2 | Punch    | Rome   |
| J3 | Reader   | Athens |
| J4 | Console  | Athens |
| J5 | Collator | London |
| J6 | Terminal | Oslo   |
| J7 | Tape     | London |
+----+----------+--------+
7 rows in set (0.00 sec)








create table SP(`S#` CHAR(4) NOT NULL , `P#` CHAR(4) NOT NULL , `J#` CHAR(4) NOT NULL, QTY INT );
Query OK, 0 rows affected (1.00 sec)

mysql> INSERT INTO SP VALUES
    -> ("S1" , "P1","J1",200),
    -> ("S1" , "P1","J4",700),
    -> ("S2" , "P3" , "J1",400),
    -> ("S2" , "P3" , "J2",200),
    -> ("S2" , "P3" , "J3",200),
    -> ("S2" , "P3" , "J4",500),
    -> ("S2" , "P3" , "J5",600),
    -> ("S2" , "P3" , "J6",400),
    -> ("S2" , "P3" , "J7",800),
    -> ("S2" , "P5" , "J2",100),
    -> ("S2" , "P3" , "J1",200),
    -> ("S2" , "P4" , "J2",500),
    -> ("S5" , "P6" , "J4",500);
Query OK, 13 rows affected (0.18 sec)
Records: 13  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM SP;
+----+----+----+------+
| S# | P# | J# | QTY  |
+----+----+----+------+
| S1 | P1 | J1 |  200 |
| S1 | P1 | J4 |  700 |
| S2 | P3 | J1 |  400 |
| S2 | P3 | J2 |  200 |
| S2 | P3 | J3 |  200 |
| S2 | P3 | J4 |  500 |
| S2 | P3 | J5 |  600 |
| S2 | P3 | J6 |  400 |
| S2 | P3 | J7 |  800 |
| S2 | P5 | J2 |  100 |
| S2 | P3 | J1 |  200 |
| S2 | P4 | J2 |  500 |
| S5 | P6 | J4 |  500 |
+----+----+----+------+
13 rows in set (0.00 sec)









create database sales;
Query OK, 1 row affected (0.19 sec)

mysql> source /home/john/Desktop/Lab Assignments/Assign_SQL1/sales-db.sql



show tables;
+--------------+
| Tables_in_hr |
+--------------+
| countries    |
| customers    |
| departments  |
| employees    |
| job_history  |
| jobs         |
| locations    |
| orders       |
| regions      |
| salespeople  |
+--------------+
10 rows in set (0.00 sec)

mysql> select * from orders;
+------+---------+------------+------+------+
| onum | amt     | odate      | cnum | snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.19 | 1990-10-03 | 2001 | 1001 |
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-04 | 2006 | 1001 |
| 3010 |  309.95 | 1990-10-04 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-04 | 2006 | 1001 |
+------+---------+------------+------+------+
10 rows in set (0.00 sec)










