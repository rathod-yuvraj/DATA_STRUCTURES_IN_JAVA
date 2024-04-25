# DATA_STRUCTURES_IN_JAVA
   # Searching a Character in the String

 # indexOf(char c)

It searches the index of specified characters within a given string. It starts searching from the beginning to the end of the string (from left to right) and returns the corresponding index if found otherwise returns -1. 

Syntax: 

# int indexOf(char c)
// Accepts character as argument, Returns index of 
// the first occurrence of specified character 


# indexOf(char c, int indexFrom)

It starts searching forward from the specified index in the string and returns the corresponding index when the specified character is encountered otherwise returns -1.
# lastIndexOf(char c, int fromIndex)

It starts searching backward from the specified index in the string. And returns the corresponding index when the specified character is encountered otherwise returns -1. 

 # charAt(int indexNumber)

Returns the character existing at the specified index, indexNumber in the given string. If the specified index number does not exist in the string, the method throws an unchecked exception, StringIndexOutOfBoundsException. 


# Searching Substring in the String

The methods used for searching a character in the string which are mentioned above can also be used for searching the substring in the string. 

# contains(CharSequence seq): 

It returns true if the string contains the specified sequence of char values otherwise returns false. Its parameters specify the sequence of characters to be searched and throw NullPointerException if seq is null. 

# Matching String Start and End 

boolean startsWith(String str): Returns true if the string str exists at the starting of the given string, else false.
boolean startsWith(String str, int indexNum): Returns true if the string str exists at the starting of the index indexNum in the given string, else false.
boolean endsWith(String str): Returns true if the string str exists at the ending of the given string, else false.
