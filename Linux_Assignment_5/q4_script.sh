#! usr/bin/bash

echo "enter the number"
flag=0
read num

if [ $num -eq 1  ]
then 
  echo "1 neither prime or composite"
else
  for (( c_num=2; c_num < $num ;c_num++))
  do
  rem=$(expr $num % $c_num)  
  if [ $rem -eq 0 ]
  then 
    flag=1
    break
  fi
  done

if [ $flag -eq 0  ]
then
  echo "given number $num is prime"
else
  echo "given number $num is not prime"
fi
fi
