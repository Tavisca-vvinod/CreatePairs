# CreatePairs
CreatePairs 
 
     You are given a list of integers, and you are allowed to group elements into pairs. Each element must either belong to a single pair or remain unpaired. Sum the products of the pairs with the values of the unpaired elements. Your goal is to maximize this sum. 

For example, consider the list {0, 1, 2, 4, 3, 5}. If you make the pairs (2, 3) and (4, 5), the sum is 0 + 1 + (2 * 3) + (4 * 5) = 27. 

You are given a int[] data containing the list of integers. Return the maximum possible sum. 
   
Definition 
Method signature: int MaximalSum(int[] data) 
 
  
Constraints 
- data will contain between 1 and 50 elements, inclusive. 
- Each element of data will be between -1000 and 1000, inclusive. 
  
Examples 
1)  {0, 1, 2, 4, 3, 5}
Returns: 27 
The example from the problem statement.  
 
2)  {-1, 1, 2, 3}
Returns: 6
If we create a pair (2, 3) we get the sum (-1) + 1 + (2 * 3) = 6. 
  
3)  {-1}     
Returns: -1 
No pairs can be created, so the answer is -1. 
 
 
4)  {-1, 0, 1}
Returns: 1 
In this case we can create a pair (-1, 0) to make the sum equal to (-1) * 0 + 1 = 1. 
  
5)  {1, 1}
Returns: 2

