import pandas pd
#create a pandas DataFrame 
data = {
    'Employee_ID': [101,102,103,104],
    'Name':['Alice','Bob','Charlie'],
    'Salary': [5000, 7000, 6000, 8000]
}
df = pd.DataFrame(data)
print("Employee Data:")
print(df)
#calculate the average salary
average_salary = df['Salary'].mean()
print("\nAverage Salary:",average_salary)
#filter employees with salary above the average
high_salary_employees = df[df['Salary'] > average_salary]
print("\nEmployees with Salry Above Average:")
print(high_salary_employees)