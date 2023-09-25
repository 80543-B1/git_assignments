roll_no = c(101,102,103,104,105)
stu_names = c("John","Abhishek","Madhvi","Rahul","Messi")
age = c(23,25,23,22,37)
score = c(69,81,91,85,99)

marks.df = data.frame(
  roll_no = roll_no,
  student_names = stu_names,
  age = age,
  score = score
  )
print(marks.df)


#print no of colmuns
ncol(marks.df)

#print no of rows
nrow(marks.df)

#1st 3 rows
head(marks.df,3)

#last 3 rows
tail(marks.df,3)

#general information
summary(marks.df)

#statistical info
marks.df