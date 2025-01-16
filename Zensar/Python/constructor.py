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