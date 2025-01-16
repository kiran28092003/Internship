import pandas as pd 

#create a Database
data = {'Name':['Alice','Bob'],'Age':[25,30]}
df = pd.DataFrame(data)
print(df)

#Filter rows where age > 25
print(df[df['Age'] > 25])


