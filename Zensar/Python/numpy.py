#==========================
#array Manipulations (Numby)
#==========================
# Importing Numpy for array manupulation
import numpy as np 
arr_var = np.arr([1,2,3,4,5])
print("\n===array Manupulations (NumPy)===")
print(f"Original array: {arr_var}")

#Adding elements
arr_var = np.append(arr_var,[6])
print(f"After append([6]): {arr_var}")

#removing elements
arr_var = np.delete(arr_var,2)
print(f"After delete(index 2): {arr_var}")

#updating elements
arr_var[1] = 99
print(f"After updating index 1 to 99: {arr_var}")

#array operations
arr_var = arr_var * 2
print(f"After element-wise multiplication by 2: {arr_var}")

#sorting
sorted_array = np.sort(arr_var)
print(f"After sort(): {sorted_array}")
