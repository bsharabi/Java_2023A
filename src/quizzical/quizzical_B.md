# First question
* Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

### Example 1:
```
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
```
### Example 2:
```
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
```
### Example 3:
```
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
```
Constraints:
* 1 <= word1.length, word2.length <= 103
* 1 <= word1[i].length, word2[i].length <= 103
* 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
* word1[i] and word2[i] consist of lowercase letters.
#### The function signature
```java
public class quizzical_B {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    }
}
```

# Second question
* You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

### Example 1:
```
Input: s = "javalove", indices = [4,5,6,7,0,1,2,3]
Output: "lovejava"
Explanation: As shown, "javalove" becomes "lovejava" after shuffling.
```
### Example 2:
```
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
```
Constraints:

* s.length == indices.length == n
* 1 <= n <= 100
* s consists of only lowercase English letters.
* 0 <= indices[i] < n
* All values of indices are unique.
#### The function signature
```java
public class quizzical_B {
    public static String restoreString(String s, int[] indices) {
    }
}
```

# Third question
* Given an array nums of integers, return how many of them contain an even number of digits.

### Example 1:
```
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
```
### Example 2:
```
Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
```

Constraints:
* 1 <= nums.length <= 500
* 1 <= nums[i] <= 105
#### The function signature
```java
public class quizzical_B {
    public static int findNumbers(int[] nums) {
    }
}
```

# Fourth question
* Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
* That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.

### Example 1:
```
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
```
### Example 2:
```
Input: nums = [6,5,4,8]
Output: [2,1,0,3]
```
### Example 3:
```
Input: nums = [7,7,7,7]
Output: [0,0,0,0]
```
Constraints:
* 2 <= nums.length <= 500
* 0 <= nums[i] <= 100
#### The function signature
```java
public class quizzical_B {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
    }
}
```

# Fifth question

Given the car class - Car with three features:
* The type of the car - type is a string type.
* The name of the model - model is a string type .
* color of car - color is a String type.
```java 
//Write the Car class and the function 
boolean isSameCar(Car c){}.
//The function returns true if the type of the car and
//The model of the object that triggers the action is the same as the name of the car
 and the type name of the object that is received as a parameter
//If not, the operation will return false
```
### Example 1:
```java
public class quizzical_B {
    public static String main(String[] args) {
        Car c1 = new Car("private", "Mazda", "red");
        Car c2 = new Car("Truck", "Volvo", "White");
        boolean ans = c1.isSameCar(c2);
    }
}
//The answer is true because b1.name is Alice and b2.name is also Alice and the author of the books is Bob
```