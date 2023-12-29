#! usr/bin/bash

choice=0

while true 
do
  echo "YOu have 6 options given below"
  echo "1. Today Date"
  echo "2. Calender"
  echo "3. list of files " 
  echo "4. current directory"
  echo "5. Exit"
  read choice  
  case $choice in
    1)
      date
      ;;
    2)
      cal
      ;;

    3)
      ls
      ;;
    4) 
      pwd 
      ;;
    5)
      echo "okay see you soon"
      break
  esac
done
