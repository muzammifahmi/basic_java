### ✅ When to Use `String` in Java

In Java, you use the `String` class whenever you're working with textual data. A `String` is a non-primitive data type that represents a sequence of characters.

---

### 🔥 Common Usages and Methods of `String` in Java

1. **Creating a String:**
```java
String name = "Fahmi";
```

2. **Concatenating Strings:**
```java
String fullName = name + " Ahmad"; 
// or
String fullName = name.concat(" Ahmad");
```

3. **Converting to Uppercase / Lowercase:**
```java
String s = "Learning Java";
s.toUpperCase(); // "LEARNING JAVA"
s.toLowerCase(); // "learning java"
```

4. **Getting String Length:**
```java
int length = s.length(); // 13
```

5. **Checking if String Contains Substring:**
```java
s.contains("Java"); // true
```

6. **Comparing Strings:**
```java
s.equals("Learning Java"); // true
s.equalsIgnoreCase("learning java"); // true
```

7. **Finding Substring Index:**
```java
s.indexOf("Java"); // 9
```

8. **Getting Character at Specific Index:**
```java
char c = s.charAt(0); // 'L'
```

9. **Extracting a Substring:**
```java
String part = s.substring(9); // "Java"
```

10. **Trimming Whitespace:**
```java
String text = "  Hello World  ";
text.trim(); // "Hello World"
```

11. **Splitting a String:**
```java
String data = "apple,orange,mango";
String[] fruits = data.split(",");
```
```