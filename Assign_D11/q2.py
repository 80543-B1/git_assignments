import pandas as pd

# 1. read_csv
df = pd.read_csv("Salaries.csv")
print(df)

# 2. first 5 records
print(df.head(5))

# 3. first 10 records
print(df.head(10))

# 4. last 5 records
print(df.tail(5))

# 5. last 10 records
print(df.tail(10))


# 6. display columns inside the dataset
print(df.columns)

# 7. shape of records
print(df.shape)

# 8 . describe dataset
print(df.describe())

# 9 . display info
print(df.info())

# 10.display types of rach columns
print(df.dtypes)
