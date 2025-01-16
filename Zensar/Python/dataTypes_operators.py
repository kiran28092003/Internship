print("Hello Python")
userVar=input("Enter String: "); y=50
#print(f"y= {y}")
print("y=",y) #optional to f {}
floatX=float(input("Enter Float Value :")) #print only prints print values 
#print(f"float value is {floatX}")
print("Float value is",floatX)
a=b=c=80
#print("value of a is:" "value of b is" "value of c is",a,b,c)
print(f"a={a},b={b},c={c}")
ax,bx,cx=50,20,3.5
#print("ax=" "bx=" "cx=",ax,bx,cx)
print(f"ax={ax},bx={bx},cx={cx}")
int_var=10
float_var=20.5
string_var="hello"
bool_var=True
list_var=[44,55,88,66]
print(f"list={list_var}")
print(f"list index1={list_var[1]}")
print(f"list={list_var[:]}")
print(f"list ind1to3={list_var[1:4]}")
print(f"list last index={list_var[-1]}")
print(f"list ind4to1={list_var[:]}")
print(f"list last to second index={list_var[-1:0:-1]}")
tuple_var=(11,77,22,44)
set_var={44,88,22}
dict_var={1:'A','B':2}
list_var[1:5]=1,2,3,4,5 #update list
print(f"list={list_var}")
list_var.append(7) #one value add to last
print(f"{list_var}") 
list_var.extend([99,88,45,99]) #more values add at last
print(f"{list_var}")
list_var.insert(2,75) #insert 75 at 2nd index
print(f"{list_var}")
list_var.remove(75) #remove 75
print(f"{list_var}")
list_var.pop(2) #pop value from second index
print(f"{list_var}")
list_var.sort() #print in ascending order
print(f"{list_var}")
list_var.reverse() #print the array in reverse order
print(f"{list_var}")

tuple_var=(11,77,22,44)
print(tuple_var+(12,55))
print(f"tuple_var={tuple_var+(12,55)}")
set_var={44,88,22}
dict_var={1:'A','B':2}

set_var={44,88,22}
print(f"Type of set_var = {type(set_var)}")
set_var.add(5)
print(f"add5={set_var}")
set_var.discard(88)
print(f"discard88={set_var}")
union_set=set_var.union({44,22,66})
print(f"union_set={union_set}")
set_difference=set_var.difference(union_set)
print(f"set_difference={set_difference}")

dict_var={1:'A','B':2}
print(f"Dictionary = {dict_var}")
dict_var['C']=3
print(f"Added new key value in dictionary= {dict_var}")
dict_var[1]=44
print(f"Updated dictionary key 1 = {dict_var}")
dict_var.pop('C')
print(f"remove Dictionary key C = {dict_var}")
keys=dict_var.keys()
print(f"keys={keys}")
values=dict_var.values()
print(f"value={values}")
items=dict_var.items()
print(f"items={items}")


#Arithmatic oerators
print(f"{a}+{b}={a+b}");print(f"{a}-{b}={a-b}")
print(f"{a}x{b}={a*b}");print(f"{a}/{b}={a/b}")
print(f"{a}%{b}={a%b}")

#comparison
print(f"{a}=={b}:{a==b}");print(f"{a}!={b}:{a!=b}")
print(f"{a}>{b}:{a>b}");print(f"{a}<{b}:{a<b}")
print(f"{a}>={b}:{a>=b}");print(f"{a}<={b}:{a<=b}")
 

 #logical 
t,f=True,False
print(f"t andf:{t and f}");print(f"t or f:{t or f}")
print(f"\nt and f:{t or f}")
print(f"t or f:{t and f}")
print(f"not f:{not f}")

#bitwise
m,n=35,23
print(f"{m}&{n} : {m&n}");print(f"{m}/{n} : {m/n}")
print(f"{m}^{n} : {m&n}")

class Person:
	pass
	def__init__(self,name,age):
		self.name=name;self.age=age

	def __init__():
		pass
	def greet():
		
		print("Hello")
person person =Person("Kiran",21)  #constructor
print(f"{person.greet}{person.name}";print(f"{person.age}")
Person p1   

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
    def div(self):
        return self.x/self.y

obj=MathematicalOperation(15,40)
print(f"{obj.x} + {obj.y} = {obj.addition()}")

obj=MathematicalOperation(40,15)
print(f"{obj.x} - {obj.y} = {obj.subtraction()}")

obj=MathematicalOperation(5,5)
print(f"{obj.x} - {obj.y} = {obj.multi()}")

obj=MathematicalOperation(5,5)
print(f"{obj.x} / {obj.y} = {obj.div()}")
#access Modifiers
#private
#protected 
class Access_var:
    def __init__(obj,a,b):
        obj.__priv_var=a
        obj._protec_var=b
    def private_access(obj):
        return obj.__priv_var
    def protected_access(obj):
        return obj._protec_var
obj=Access_var(10,20)
print(f"Private Variables Declare in class is: {obj.private_access()}")
print(f"Protected Variables Declare in class is: {obj.protected_access()}")

