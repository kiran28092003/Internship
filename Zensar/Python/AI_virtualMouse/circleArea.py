class Circle:
    def __init__(self):
        self._pi = 3.14159

class CircleArea(Circle):
    def __init__(self, radius):
        super().__init__() 
        self.radius = radius
    
    def calculate_area(self):
        return self._pi * (self.radius ** 2)
radius = 5
circle = CircleArea(radius)
area = circle.calculate_area()
print(f"The area of the circle with radius {radius} is {area:.2f}")
