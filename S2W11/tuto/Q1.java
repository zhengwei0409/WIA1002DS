package S2W11.tuto;

public class Q1 {
    /*
     *  Linear search searches an element in a given list of length N linearly from the first element to the last element with O(N) time complexity.

        Binary search searches an element in a given sorted list of length N by comparing it with the value of the pivot element with O(log(N)) time complexity. Since it needs a sorted list (conventionally sorted in ascending order), the given list will need to be sorted first before performing the binary search. Sorted list: 3 8 12 34 54 61 85 110

        While searching for number 45:

        Linear search algorithm will iterate from index 0 to the last index and return -1 because up until the last index this element is not found. Number of iterations is 8.
        Binary search algorithm will take the middle element 34 as pivot point and found that it is lower than 45, so the low will be set to element 54 and the mid will be set to 85, then because the mid is higher than 45 so the high will be set to 54 and the mid will also be 54, then the high will become smaller than low and the search returns -1 as element is not found. Number of iterations is 3.

        While searching for number 54:

        Linear search algorithm will iterate from index 0 up until index 4 where 54 is found and the index will be returned. Number of iterations is 5.
        Binary search algorithm for this case will take the middle element 54 as a pivot point and immediately return the middle index because this element is exactly the element to be searched. Number of iteration is 1.
     * 
     */
}
