#write a program to merge the contents of multiple files into a single file
def merge_files(files, output):
    with open(output, 'w') as outfile:
        for file in files:
            with open(file, 'r') as infile:
                outfile.write(infile.read() + "\n")

# Example usage
files = ['file1.txt', 'file2.txt', 'file3.txt']  # List your files here
output = 'merged_output.txt'  # Output file name
merge_files(files, output)

#write a program to remove all blank lines from a file and save the result in the same file
def remove_blank_lines(file_name):
    with open(file_name, 'r') as file:
        lines = file.readlines()

    with open(file_name, 'w') as file:
        for line in lines:
            if line.strip():
                file.write(line)

file_name = 'example.txt' 
remove_blank_lines(file_name)

#write a program to reverse the content of each line in a file and save it to a new file
def reverse_lines(input_file, output_file):
    with open(input_file, 'r') as infile, open(output_file, 'w') as outfile:
        for line in infile:
            outfile.write(line[::-1])
input_file = 'example.txt'
output_file = 'reversed_output.txt' 
reverse_lines(input_file, output_file)

#create a program that replaces all occurences of a specific word in a file with another word and saves the result in the same file

def replace_word(file_name, old_word, new_word):
    with open(file_name, 'r+') as file:
        content = file.read()
        content = content.replace(old_word, new_word)
        file.seek(0)
        file.write(content)
        file.truncate()
file_name = 'example.txt'  # Replace with your file name
old_word = 'oldword'  # Replace with the word you want to replace
new_word = 'newword'  # Replace with the new word
replace_word(file_name, old_word, new_word)
