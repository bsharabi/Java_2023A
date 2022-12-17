# First question
* Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
### Example 1:
```
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
```
### Example 2:
```
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
```
Constraints:
* The given address is a valid IPv4 address.
#### The function signature
```java
public class quizzical_A {
    public static String defangIPaddr(String address) {
    }
}
```

# Second question
* There is a programming language with only four operations and one variable X:

* ++X and X++ increments the value of the variable X by 1.
* --X and X-- decrements the value of the variable X by 1.
* Initially, the value of X is 0.

* Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
### Example 1:
```
Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
```
### Example 2:
```
Input: operations = ["++X","++X","X++"]
Output: 3
Explanation: The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.
```
Constraints:

* 1 <= operations.length <= 100
* operations[i] will be either "++X", "X++", "--X", or "X--".
#### The function signature
```java
public class quizzical_A {
    public static int finalValueAfterOperations(String[] operations) {
    }
}
```

# Third question
* Given an array of integers nums, return the number of good pairs.

* A pair (i, j) is called good if nums[i] == nums[j] and i < j.
### Example 1:
```
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
```
### Example 2:
```
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
```

### Example 3:
```
Input: nums = [1,2,3]
Output: 0.
```
Constraints:
* 1 <= nums.length <= 100
* 1 <= nums[i] <= 100
#### The function signature
```java
public class quizzical_A {
    public static int numIdenticalPairs(int[] nums) {
    }
}
```

# Fourth question

* You are given an mxn integer grid accounts where accounts[i][j] is the amount of money the 1th customer has in the jth bank Return the wealth that the richest customer has
* A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

### Example 1:
```
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
```
### Example 2:
```
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
```

### Example 3:
```
Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
```
Constraints:
* m == accounts.length
* n == accounts[i].length
* 1 <= m, n <= 50
* 1 <= accounts[i][j] <= 100
#### The function signature
```java
public class quizzical_A {
    public static int maximumWealth(int[][] accounts){
    }
}
```

# Fifth question
Given the book class - Book with three features:
* The name of the book - name is a string type.
* The name of the author - author is a string type .
* Number of pages - pages is an int type.
```java 
//Write in the Book class the function 
boolean isSameBook(Book b){}.
//The function returns true if the name of the book and
//The author of the object that triggers the action is the same as the name of the book and the author name of the object that is received as a parameter
//If not, the operation will return false
```
### Example 1:
```java
public class quizzical_A {
    public static String main(String[] args) {
        Book b1 = new Book(Alice, Bob, 1456);
        Book b2 = new Book(Alice, Bob, 765);
        boolean ans = b1.isSameBook(b2);
    }
}
//The answer is true because b1.name is Alice and b2.name is also Alice and 
//the author of the books is Bob
```