[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/6w_STSeM)

# Programming Assignment 2 

**Due: Sep 17th, 2024, 11:59 PM**

---
**Instructions**

1. Click on `Accept Assignment` at [this link](https://classroom.github.com/a/ZXB0E04o). This is equivalent to forking the repository.

2. Navigate to the repository you just forked. It should be named `pa2-<your-github-username>`

3. Click on the green `Code` button. Click on SSH tab and copy the SSH link (it is important to use SSH and not HTTPS).

4. Open the terminal on your computer and navigate to the folder where you want to clone the repository.

5. Run `git clone <copied-ssh-link>`. Replace `<copied-ssh-link>` with the link you copied in step 3.

6. In Visual Studio Code, click on File -> Open and open the folder of the repository. 

---

## Question 1. Singly Sorted Linked List

Implement a singly sorted linked list. The list should be sorted in **ascending order** at all times.

Fill in skeleton code in `LinkedList.java` located in `app/src/main/java/pa2/` folder. 

The code should be able to compile and run.

You can use the main method in `LinkedList.java` to do some informal testing. More formal testing will be done in the next question.

Please note that the linked list should be sorted at all times and the implementation of `traverse` must be recursive.

## Question 2. Write JUnit Test Cases

Write test cases for the singly sorted linked list from Question 1. 

Fill in skeleton code in `LinkedListTest.java` located in `app/src/test/java/pa2/` folder

An example test case is given in the skeleton code: 

```java
@Test
void testRemove() {
    LinkedList list = new LinkedList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.remove(2);
    assertEquals("1 3 ", list.traverse());
}
```

The test case above tests the add and remove methods. First 1, 2, 3 are added to the list. Then 2 is removed. Then traverse() is called to get the string representation of the list. The string representation should be "1 3 ".

Try to cover ALL cases for each method. **Missing a test case scenario, even if your implementation is correct, will result in a deduction of points**.

You must think about all possible edge cases and scenarios when writing test cases. For example, what happens when you try to remove an element that is not in the list? What happens when you try to remove the first element? What happens when you try to remove the last element? What happens when you try to remove the only element in the list?

## Evaluation

Your submission will be evaluated based on the correctness **_and completeness_** of your implementation and test cases. If your implementation is correct but your test cases are incomplete, you will lose points. If your implementation is incorrect, you will lose even more points.