import pandas as pd
import numpy as np
# 1 read advertising.csv
df = pd.read_csv("Advertising.csv")

# 2. first 5 records
print(df.head(5))

# 3. last 5 records
print(df.tail(5))

# 4. display columns inside the dataset
print(df.columns)

# 5. last 3 records
print(df.tail(3))

# 6. display info of ftable
print(df.info())

# 7. display type of columns
print(df.dtypes)

# 8 . check for null values in dataset and display
# the sum of values inside the column

print(df.isna())
print(df.isna().sum())

# 9 . drop a column radio from dataset
#and display 10 records
df.drop('radio',axis=1,inplace=True)
print(df.head(10))

#10 . increase sales by 10% and add_new_column = "updated_sales"
df['updated_sales'] = df['sales'] + (0.10*df['sales'])
print(df)

#11. display shape
print(df.shape)

#12. describe the dataset
print(df.describe())