### Linked Lists
- every node stores **the data** itself and **a reference the next node**
---

### Linked Lists Operations
**Manipulation the first item** (insertion or removal):
- O(1) running time – this is why we like linked lists

**Manipulating arbitrary item**
- O(N) running time – if we have to do several of these operations then linked list is not the best option possible !!!
---
**Linked Lists Advantages**
1. **Dynamic Data Structures**
   - they can acquire memory at run-time by inserting new nodes without resizing the data structures (as we have seen with arrays)

2. **Grow The Data structure Organically**
   - not a problem if we do not know the number of items we want to store at compile-time
   manipulating the first item is fast – O(1) running time

3. **Can Store Different Sized Items** 
   - arrays on the other hand assume the items have the exact same size
---
**Linked Lists Disadvantages**

1. More Memory
   - linked lists need more memory than arrays because we have to store the references
2. No Random Access 
   - there are no indexes - we can access the first node (head node) exclusively
3. Can Not Go Backwards
   - how to get the previous item?
4. Not Predictable 
   - the running time of the application depends on what operations the users do

---
### Big-O Values for LinkedList Operations
| **Operation**                          | **Time Complexity** |
|----------------------------------------|---------------------|
| Find first item(head node)             | O(1)                |
| Search for arbitrary item              | O(N)                |
| Insert item to  the beginning          | O(1)                |
| Insert item to  the arbitrary position | O(N)                |
| Removing first item                    | O(1)                |
| Removing arbitrary item                | O(N)                |

---
NOTE: **Linked lists in Java**

In **_a singly linked list_** we store a reference to the first node (head node) exclusively. 

Which means that if we want to insert items to the end of the linked list then we have to iterate through the list first - this is why it takes O(N) running time.

But in Java's Linked list, there is a reference to the last node of the linked list as well!

It means of course that **inserting items to the end** of the linked list (and **removing items from the end** of a linked list) takes **O(1)** constant running time complexity.
