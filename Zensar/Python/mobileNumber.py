#mobile number
import re
Phone=input("Enter your phone number")
pattern=r'[0-9]'
if len(Phone)==10 and re.match(pattern,Phone):
    print("Phone number is valid")
else:
    print("Phone number is not valid")