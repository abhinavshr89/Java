# Datatypes in java

### Primitive : primitive data types are the most basic data types. They are not objects and hold their values directly in memory. Java has eight primitive data types, each serving a specific purpose and varying in size and range. Here are the primitive data types in Java.

--------------------------------------------
### Primitive data types 
#### 1.byte 
- Size: 1 byte
- Range: -128 to 127
- usage: Useful for saving memory in large arrays where the memory savings are most needed.
```java
 byte by = 127;
```


#### 2.short
- Size: 2 bytes
- Range: -32,768 to 32,767
- usage:Can also be used to save memory in large arrays, somewhat similar to byte.
```java
 short sh = 32000;
```
#### 3.int
- Size: 4 bytes
- Range: 2<sup>31</sup> to 2<sup>31</sup>-1
- usage: Generally used as the default data type for integer values unless there is a concern about memory.
```java
 int num1 = 9;
```
#### 4.long
- size : 8 bytes
- Range: -2<sup>63</sup> to 2<sup>63</sup>-1
- Usage: Used when a wider range than int is needed.
```java
  long l = 123456789L;
```
#### 5.float 
- Size:  4 bytes
- Range:Single-precision 32-bit IEEE 754 floating point
- usage: Used for saving memory in large arrays of floating point numbers. Should never be used for precise values, such as currency.
```java
 float f = 5.75f;
```

#### 6.double
- Size: 8 bytes
- Description: Double-precision 64-bit IEEE 754 floating point
-  Usage: The default choice for decimal values. More precise than float.
```java
 double d = 19.99;
```
#### 7.char
- Size: 2 bytes
- Description: Single 16-bit Unicode character
- Range: '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)
- Usage: Used to store any character.
```java
char letter = 'A';
```
#### 8.boolean
- Size: Not precisely defined (depends on the JVM implementation)
- Values: true or false
- Usage: Used for simple flags that track true/false conditions.
```java
 boolean flag = true;
```