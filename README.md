# 🟢 Java Array Challenges

A step-by-step practice guide for learning arrays in **Java**.  
Each step builds on the previous one, starting from basics (indexing) up to solving common array problems (sum, average, min/max, reverse).

---

## 📘 Challenges

### 1) Understand array indexing
- **Goal:** Declare a static array of 5 elements and print each element by index.  
- **Hint:** Indexes start at `0`.  

**Expected Output:**
10
20
30
40
50


---

### 2) Print all elements with a for loop
- **Goal:** Iterate through an array and print every element (less repetitive).  
- **Hint:** Use `arr.length`.  

---

### 3) Read a single value from user into an array position
- **Goal:** Practice using `Scanner` and storing input into `arr[0]`.  
- **Hint:** Remember to `import java.util.Scanner;`.  

---

### 4) Fill the whole array from user input
- **Goal:** Ask the user for 5 numbers and store them in an array.  
- **Hint:** Use a `for` loop to read `arr[i]`.  

---

### 5) Odd or Even Checker
- **Goal:** For each number in the array, check if it is **odd or even**.  
- **Hint:** Use `if (arr[i] % 2 == 0)` for even, else odd.  

---

### 6) Compute the sum of array elements
- **Goal:** Add all elements of the array and print the sum.  
- **Hint:** Initialize `sum = 0`, then use `sum += arr[i]`.  

---

### 7) Compute the average
- **Goal:** Use the sum of the array elements to compute the average.  
- **Hint:** Cast to `double` to avoid integer division.  

---

### 8) Find smallest and largest (min & max)
- **Goal:** Scan the array once and track the minimum and maximum values.  
- **Hint:** Start with `min = arr[0]` and `max = arr[0]`, then compare from index `1`.  

---

### 9) Print the array in reverse order
- **Goal:** Print elements from the last index down to `0`.  
- **Hint:** Loop from `arr.length - 1` down to `0`.  

---

## 🚀 Practice Plan
1. Do **Step 1 → Step 2** to learn indexing and looping.  
2. Do **Step 3 → Step 4** to practice `Scanner` + filling arrays.  
3. Do **Step 5** for odd/even logic.  
4. Do **Step 6 → Step 7** for sum, average, and min/max.  
5. Do **Step 8 → Step 9** for reversing.  

After completing these, you’ll have the skills to solve bigger challenges like:
- Reversing arrays entered by the user  
- Finding min & max in any dataset  
- Calculating sum & average from user inputs  

---

## 🛠 Requirements
- Java JDK 8 or later  
- A code editor or IDE (VS Code, IntelliJ, Eclipse, etc.)  

---

## ▶️ How to Run
1. Clone or download this repository.  
2. Open a terminal in the project folder.  
3. Compile the file (example for `Step1.java`):  
   ```bash
   javac Step1.java
