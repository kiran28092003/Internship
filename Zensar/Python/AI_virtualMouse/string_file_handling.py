str="python fundamental with lots of hands-on"
#print(f"string length = {str.len()}")
print(f"string remove whitespace = {str.strip(' ')}")
print(f"string in uppercase = {str.upper()}")
print(f"string in lowercase = {str.lower()}")
print(f"old string {str} replace with new string = {str.replace("python","java")}")
print(f"string occurence count = {str.count('with')}")
print(f"check string start with R={str.startswith('R')}")
print(f"check string end with n={str.endswith('n')}")
print(f"capitilize first char={str.capitalize()}")
#different wat to access string
print('String str[6]:',str[6]) #we can use the index with slice operator
print('String str[:]:',str[:])
print('String str[0:6]:',str[0:6])#character from position 0 to 5
print('String str[:5]:',str[:5])
print('String str:',str)

with open("example.txt",'w') as f:
    f.write("Hello File")

with open("example.txt",'r') as f:
    content=f.read();print(content)

with open("example.txt",'a') as f:
    f.write("added at end of file")

with open("example.txt",'r') as f:
    content=f.read();print(content)
