# question 2 files num.txt line1 25,line2 18
# result.txt empty ..perform arithmatic operation in num,txt file and print the output in result,txt

with open("num.txt", "w") as num_file:
    num1 = 25  
    num2 = 18  
    num_file.write(f"value of A:{num1}, value of B:{num2}")
    
addition = num1 + num2
subtraction = num1 - num2
multiplication = num1 * num2
division = num1 / num2 if num2 != 0 else "Division by zero error"

with open("result.txt", "w") as result_file:
    result_file.write(f"Addition: {addition}\n")
    result_file.write(f"Subtraction: {subtraction}\n")
    result_file.write(f"Multiplication: {multiplication}\n")
    result_file.write(f"Division: {division}\n")

print("Arithmetic operations completed and written to result.txt.")
with open("result.txt", 'r') as f:
   content=f.read();print(content)  

