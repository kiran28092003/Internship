#inheritance
class Compony:
    def __init__(self,name,proj):
        self.name=name;self.proj=proj
    def show(self,x):
        slf.code=floatX
        print("Compony Location Code Is :",x)
class Emp(Compony):
    def__init__(self,ename,sal,cname,proj):
        Compony.__init__(self,ename,sal,cname,proj)
        self.ename=ename;self.__sal=sal
    def show_salary(self):
        print(f"Salary of {self.ename} is {self.__sal}")
c=Compony("Jio Ind","6G")
e=Emp("Ashish",5000,c.name,c.proj)