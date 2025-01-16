class MathematicalOperation:
    #constructor
    def __init__(self,x,y):
        self.x=x;self.y=y

    def addition(self):
        return self.x+self.y
    def subtraction(self):
        return self.x-self.y
    def multi(self):
        return self.x*self.y
    def div(self,x,y):
        try:
            res=x/y
        except ZeroDivisionError as e:
            print("Division by zero not allowed:",e)
        except TypeError as e:
            print("Invalid Input:",e)
        else:
            print(f"{x} / {y} = {res}")
        finally:
            print("Its always Execute")

obj=MathematicalOperation(15,40)
print(f"{obj.x} + {obj.y} = {obj.addition()}")

obj=MathematicalOperation(40,15)
print(f"{obj.x} - {obj.y} = {obj.subtraction()}")

obj=MathematicalOperation(5,5)
print(f"{obj.x} * {obj.y} = {obj.multi()}")

obj=MathematicalOperation(5,5)
obj.div(5,5)