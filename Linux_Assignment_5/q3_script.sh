#! usr/bin/bash

echo "Enter the file name"
read name

if [ -f $name  ]
then
  echo "$name is a file"
  
  size=$(du -h $name | cut -f1)
  echo "Size of the file $name:$size" 

elif [ -d $name ]
then 
  echo "$name is a directory"
  content=$(ls)

  echo "Content of the directory $name is $content"

else 

  echo "$name is neither file nor directory"


fi   
  







