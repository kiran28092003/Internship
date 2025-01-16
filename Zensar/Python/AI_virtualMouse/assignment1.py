class assignment:
    def __init__(self,a,b,c):
        self.a=a
        self.b=b
        self.c=c
    def max(self):
        if self.a>self.b and self.a>self.c:
            return self.a 
        elif self.b>self.a and self.b>self.c:
            return self.b 
        else:
            return self.c 
obj=assignment(10,5,8)
print("Maximum value is:",obj.max())

class Assignment:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def max(self):
        if self.a > self.b and self.a > self.c:
            return self.a
        elif self.b > self.a and self.b > self.c:
            return self.b
        else:
            return self.c

a = int(input("Enter the first value: "))
b = int(input("Enter the second value: "))
c = int(input("Enter the third value: "))

obj = Assignment(a, b, c)
print("Maximum value is:", obj.max())

class SearchAlgorithm:
    def __init__(self, arr):
        self.arr = arr

    def linear_search(self, target):
        for i in range(len(self.arr)):
            if self.arr[i] == target:
                return i  # Return the index where the target is found
        return -1  # Return -1 if the target is not found
n = int(input("Enter the number of elements in the array: "))
arr = []

print("Enter the elements:")
for _ in range(n):
    element = int(input())
    arr.append(element)

target = int(input("Enter the target value to search: "))
search_obj = SearchAlgorithm(arr)
result = search_obj.linear_search(target)

if result != -1:
    print(f"Target value {target} found at index {result}.")
else:
    print(f"Target value {target} not found in the array.")


class Factorial:
    def __init__(self, number):
        self.number = number

    def calculate(self):
        if self.number < 0:
            return "Factorial is not defined for negative numbers."
        result = 1
        n = self.number
        while n > 0:
            result *= n
            n -= 1
        return result
num = int(input("Enter a number to find its factorial: "))
factorial_obj = Factorial(num)
print(f"The factorial of {num} is: {factorial_obj.calculate()}")
