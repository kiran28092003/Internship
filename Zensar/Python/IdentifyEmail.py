#email
import re
Email=input("Enter your email:")
pattern=r'^[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}$'
if re.match(pattern,Email):
    print("Email pattern matches")
    print(Email)
else:
    print("Invalid email")
