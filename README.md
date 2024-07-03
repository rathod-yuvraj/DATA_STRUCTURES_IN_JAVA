# DATA_STRUCTURES_IN_JAVA

# DATA_STRUCTURES_IN_JAVA
Data Structures in Java

?# What are Data Structures in Java?
The way that data is organized and stored in a computer program's memory relies closely on Java records structures. The Java well-known library includes a significant type of built-in statistics structures. A few of the records systems that permit programmers short and simple ways to save and arrange data include connected lists, stacks, queues, and arrays. Developers can quickly perform operations like insertion, deletion, searching, and sorting because they provide a range of mechanisms for getting Access to, altering, and managing data. Java programmers can reduce memory use and considerably boost the overall efficiency of their programs by using these data structures.

TYPE OF DATA STRUCTURES IN JAVA

The list of data structures in Java listed below

Arrays

ArrayList

LinkedList

Stack

Queue

HashMap

HashSet

TreeSet

TreeMap

Graph

Tree

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
boolean startsWith(String str, int indexNum): 
Returns true if the string str exists at the starting of the index indexNum in the given string, else false.
boolean endsWith(String str): Returns true if the string str exists at the ending of the given string, else false.


# Array Operations in Java
Array Operations
Common operations performed on arrays include:

# Traversal : Visiting each element of an array in a specific order (e.g., sequential, reverse).
# Insertion : Adding a new element to an array at a specific index.
# Deletion : Removing an element from an array at a specific index.
# Searching : Finding the index of an element in an array.
*Common Array Operations*
 # Easy Problems on Array:
Find the largest three elements in an array
Find Second largest element in an array
Move all zeroes to end of array
Rearrange array such that even positioned are greater than odd
Rearrange an array in maximum minimum form using Two Pointer Technique
Segregate even and odd numbers
Reversal algorithm for array rotation
Print left rotation of array in O(n) time and O(1) space
Sort an array in wave form
Sort an array which contain 1 to n values
Count the number of possible triangles
Print All Distinct Elements of a given integer array
Find the element that appears once in Array where every other element appears twice
Leaders in an array
Find sub-array with given sum
*Check if a Java Array Contains a Value*
How to Copy an Array in Java
Removing the First Element of an Array
Finding the Min and Max in an Array with Java
Find Sum and Average in a Java Array
How to Invert an Array in Java
Join and Split Arrays and Collections in Java
Combining Different Types of Collections in Java
Find All Pairs of Numbers in an Array That Add Up to a Given Sum
Sorting in Java
Efficient Word Frequency Calculator in Java
Insertion Sort in Java
2. Arrays and Helper Classes
Before proceeding, it’s useful to understand what is an array in Java, and how to use it. If it’s your first time working with it in Java, we suggest having a look at this previous post where we covered all basic concepts.

Please note that the basic operations that an array supports are, in a certain way, limited. It’s not uncommon to see complex algorithms to execute relatively simple tasks when it comes to arrays.

For this reason, for most of our operations, we’ll be using helper classes and methods to assist us: the Arrays class provided by Java and the Apache’s ArrayUtils one.

To include the latter in our project, we’ll have to add the Apache Commons dependency:

<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.12.0</version>
</dependency>
We can check out the latest version of this artifact on Maven Central.

3. Get the First and Last Element of an Array
This is one of the most common and simple tasks thanks to the access-by-index nature of arrays.

Let’s start by declaring and initializing an int array that will be used in all our examples (unless we specify otherwise):

int[] array = new int[] { 3, 5, 2, 5, 14, 4 };
Knowing that the first item of an array is associated with the index value 0 and that it has a length attribute that we can use, then it’s simple to figure out how we can get these two elements:

int firstItem = array[0];
int lastItem = array[array.length - 1];
4. Get a Random Value from an Array
By using the java.util.Random object we can easily get any value from our array:

int anyValue = array[new Random().nextInt(array.length)];
5. Append a New Item to an Array
As we know, arrays hold a fixed size of values. Therefore, we can’t just add an item and exceed this limit.

We’ll need to start by declaring a new, larger array, and copy the elements of the base array to the second one.

Fortunately, the Arrays class provides a handy method to replicate the values of an array to a new different-sized structure:

int[] newArray = Arrays.copyOf(array, array.length + 1);
newArray[newArray.length - 1] = newItem;
Optionally, if the ArrayUtils class is accessible in our project, we can make use of its add method (or its addAll alternative) to accomplish our objective in a one-line statement:

int[] newArray = ArrayUtils.add(array, newItem);
As we can imagine, this method doesn’t modify the original array object; we have to assign its output to a new variable.

6. Insert a Value Between Two Values
Because of its indexed-values character, inserting an item in an array between two others is not a trivial job.

Apache considered this a typical scenario and implemented a method in its ArrayUtils class to simplify the solution:

int[] largerArray = ArrayUtils.insert(2, array, 77);
We have to specify the index in which we want to insert the value, and the output will be a new array containing a larger number of elements.

The last argument is a variable argument (a.k.a. vararg) thus we can insert any number of items in the array.

7. Compare Two Arrays
Even though arrays are Objects and therefore provide an equals method, they use the default implementation of it, relying only on reference equality.

We can anyhow invoke the java.util.Arrays‘ equals method to check if two array objects contain the same values:

boolean areEqual = Arrays.equals(array1, array2);
Note: this method is not effective for jagged arrays. The appropriate method to verify multi-dimensional structures’ equality is the Arrays.deepEquals one.

8. Check if an Array Is Empty
This is an uncomplicated assignment having in mind that we can use the length attribute of arrays:

boolean isEmpty = array == null || array.length == 0;
Moreover, we also have a null-safe method in the ArrayUtils helper class that we can use:

boolean isEmpty = ArrayUtils.isEmpty(array);
This function still depends on the length of the data structure, which considers nulls and empty sub-arrays as valid values too, so we’ll have to keep an eye on these edge cases:

// These are empty arrays
Integer[] array1 = {};
Integer[] array2 = null;
Integer[] array3 = new Integer[0];

// All these will NOT be considered empty
Integer[] array3 = { null, null, null };
Integer[][] array4 = { {}, {}, {} };
Integer[] array5 = new Integer[3];
9. How to Shuffle the Elements of an Array
In order to shuffle the items in an array, we can use the ArrayUtil‘s feature:

ArrayUtils.shuffle(array);
This is a void method and operates on the actual values of the array.

10. Box and Unbox Arrays
We often come across methods that support only Object-based arrays.

Again the ArrayUtils helper class comes in handy to get a boxed version of our primitive array:

Integer[] list = ArrayUtils.toObject(array);
The inverse operation is also possible:

Integer[] objectArray = { 3, 5, 2, 5, 14, 4 };
int[] array = ArrayUtils.toPrimitive(objectArray);
11. Remove Duplicates from an Array
The easiest way of removing duplicates is by converting the array to a Set implementation.

As we may know, Collections use Generics and hence don’t support primitive types.

For this reason, if we’re not handling object-based arrays as in our example, we’ll first need to box our values:

// Box
Integer[] list = ArrayUtils.toObject(array);
// Remove duplicates
Set<Integer> set = new HashSet<Integer>(Arrays.asList(list));
// Create array and unbox
return ArrayUtils.toPrimitive(set.toArray(new Integer[set.size()]));
Note: we can use other techniques to convert between an array and a Set object as well.

Also, if we need to preserve the order of our elements, we must use a different Set implementation, such as a LinkedHashSet.

12. How to Print an Array
Same as with the equals method, the array’s toString function uses the default implementation provided by the Object class, which isn’t very useful.

Both Arrays and ArrayUtils classes ship with their implementations to convert the data structures to a readable String.

Apart from the slightly different format they use, the most important distinction is how they treat multi-dimensional objects.

The Java Util’s class provides two static methods we can use:

toString: doesn’t work well with jagged arrays
deepToString: supports any Object-based arrays but doesn’t compile with primitive array arguments
On the other hand, Apache’s implementation offers a single toString method that works correctly in any case:

String arrayAsString = ArrayUtils.toString(array);
13. Map an Array to Another Type
It’s often useful to apply operations on all array items, possibly converting them to another type of object.

With this objective in mind, we’ll try to create a flexible helper method using Generics:

public static <T, U> U[] mapObjectArray(
  T[] array, Function<T, U> function,
  Class<U> targetClazz) {
    U[] newArray = (U[]) Array.newInstance(targetClazz, array.length);
    for (int i = 0; i < array.length; i++) {
        newArray[i] = function.apply(array[i]);
    }
    return newArray;
}
If we don’t use Java 8 in our project, we can discard the Function argument, and create a method for each mapping that we need to carry out.

We can now reuse our generic method for different operations. Let’s create two test cases to illustrate this:

@Test
public void whenMapArrayMultiplyingValues_thenReturnMultipliedArray() {
    Integer[] multipliedExpectedArray = new Integer[] { 6, 10, 4, 10, 28, 8 };
    Integer[] output = 
      MyHelperClass.mapObjectArray(array, value -> value * 2, Integer.class);

    assertThat(output).containsExactly(multipliedExpectedArray);
}

@Test
public void whenMapDividingObjectArray_thenReturnMultipliedArray() {
    Double[] multipliedExpectedArray = new Double[] { 1.5, 2.5, 1.0, 2.5, 7.0, 2.0 };
    Double[] output =
      MyHelperClass.mapObjectArray(array, value -> value / 2.0, Double.class);

    assertThat(output).containsExactly(multipliedExpectedArray);
}
For primitive types, we’ll have to box our values first.

As an alternative, we can turn to Java 8’s Streams to carry out the mapping for us.

We’ll need to transform the array into a Stream of Objects first. We can do so with the Arrays.stream method.

For example, if we want to map our int values to a custom String representation, we’ll implement this:

String[] stringArray = Arrays.stream(array)
  .mapToObj(value -> String.format("Value: %s", value))
  .toArray(String[]::new);
14. Filter Values in an Array
Filtering out values from a collection is a common task that we might have to perform in more than one occasion.

This is because at the time we create the array that will receive the values, we can’t be sure of its final size. Therefore, we’ll rely on the Streams approach again.

Imagine we want to remove all odd numbers from an array:

int[] evenArray = Arrays.stream(array)
  .filter(value -> value % 2 == 0)
  .toArray();

# Java ArrayList 

Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.

The ArrayList in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of the List interface here. The ArrayList maintains the insertion order internally.

It inherits the AbstractList class and implements List interface.

Java ArrayList is a part of the Java collections framework and it is a class of java.util package. It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. This class is found in java.util package. The main advantage of ArrayList in Java is, that if we declare an array then we need to mention the size, but in ArrayList, it is not needed to mention the size of ArrayList. If you want to mention the size then you can do it.
