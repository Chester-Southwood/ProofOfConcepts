# Memo - to remember

* Dynamic Programming is about memoization, checking work you've already done to alter how your program is solving a problem.

* We want to solve a given problem, one time.

# Fibonacci

* By definition, the first two values in the fibonacci sequence is : 0, 1

* Pattern goes as: 0, 1, 1, 2, 3, 5, 8, fib(n - 2) + fib(n - 1)

## Ghastly Solution

 ```java
  public static int fib(int n)
  {
      if(n < 2)
      {
          return n;
      }
      else
      {
          return fib(n-1) + fib(n - 2);
      }
  }
  ```


![Text I think Screen Reader Views](ScreenShotsOfLecture/showing-time-complexity.png "Tree Diagram of \"Ghastly\" Version of Solution.")


### Time Complexity: O(2^n)



![Text I think Screen Reader Views](./ScreenShotsOfLecture/tree-diagram.jpg "Tree Diagram of \"Ghastly\" Version of Solution.")

## More Effiecient Solution Due To Memoization

 ```java
    int[] fibValues = new int[Max_Int];

    //[0, 0, 0, 0, 0, 0, 0, ...]
    // 0  1  2  3  4  5  6  n+1

    int fib(int n)
    {
        if(n < 2)
        {
            fibValues[n] = n;
            return n;
        }
        else if(fibValues[n] == 0)
        {
            fibValues[n] = fib(n - 1) + fib(n - 2);
        }
        return fibValues[n];
    }
  ```

  ![Text I think Screen Reader Views](ScreenShotsOfLecture/showing-time-complexity-non-ghastly.png "Tree Diagram of \"Ghastly\" Version of Solution.")

### Time Complexity: O(n)

  # Example of Memoization

  * Maze Traversal: Not pure
  * Queens ProblemA form, not pure, but you can argue it has a feel.

  > Nothing fancy, just a form of solving a problem by memoization. - Tom Capual



# Dynammic Programming Fundementals
* Memoization
* Backtracking

## Example - Golf Tee

* Legal

  ![Text I think Screen Reader Views](MyDrawings/Legal.png "Tree Diagram of \"Ghastly\" Version of Solution.")

* Illegal 

  ![Text I think Screen Reader Views](MyDrawings/Illegal.png "Tree Diagram of \"Ghastly\" Version of Solution.")

### Each Recursive Level, you keep track of what you did before.

## Example - Triangle Wars

  ![Text I think Screen Reader Views](MyDrawings/triangle-wars.png "Tree Diagram of \"Ghastly\" Version of Solution.")

  (Will be covered in next lecture)

## Example - Pinkie and Brain Coin Problem

[Coin Problem PDF](./Handouts/ContestQuestionFromStudent.pdf "Coin Prolem PDF")

* Greedy Algorithm: Takes what looks best.

  *   10$     ___
  *    5%     ___
  *    1$     ___
  *  .50      ___
  *  .25      ___
  *  .10      ___
  *  .05      ___
  *  .01      ___

    .77 -> .50 -> .27 -> .05 -> .01 -> 0.1



* What was my best solution so far, if new one isn't, go back and try different one.


## Knapsack Problem
* We have a "knabsack" which has a maximum capacity. 
* We have a set of items where each item has a weight and a benefit.
* We want to fill the knabsack such that the benefit of the items in the knapsack is maximized.

    | Item #          | Info | Weight |
    | ------        | ----   | ----   |
    | 1             | 3      | 2
    | 2             | 4      | 3
    | 3             | 10     | 10
    | 4             | 5      | 3
    | 5             | 6      | 5

1. Fractional: You can take fractions of an item. GREEDY
2. 0/1: Take whole item or not.

    | Knapsack      | Capacity
    | ------        | ----   
    |               | 5      
    |               | 8      
    |               | 10     
    |               | 12      
    |               | 15 


* Combinations, Permutation, .... => n! for Brute Force! :( 
    * Brute Force, easily to increase, 12! is over 1 billion.

### Knabsack Example


| Item #          | Info | Weight |
| ------        | ----   | ----   |
| 1             | 3      | 2
| 2             | 4      | 3
| 3             | 7      | 6
| 4             | 5      | 3
| 5             | 6      | 5

______

|   | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
| - | - | - | - | - | - | - | - |
| 1 | 0 | 3 | 3 | 3 | 3 | 3 | 3 |
| 2 | 0 | 3 | 4 | 4 | 7 | 7 | 7 |
| 3 | 0 | 3 | 4 | 4 | 7 | 7 | 7 |
| 4 | 0 | 3 | 5 | 5 | 8 | 9 | 9 |
| 5 | 0 | 3 | 5 | 5 | 8 | 9 | 9 | 


- X - Weight (Last is maximum it can hold)
- Y - Current Knabsack (Last will contain the max benefit)

* Order does not matter on which you did first.

> Essentailly a nested loop

> Really a straight forward solution, happens to be memoization.

> Doesn't use recursion. Recursion is just itteration without a loop.