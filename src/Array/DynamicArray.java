package Array;

import java.util.Arrays;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object [] array;
    //Creating new Object array name array

    public DynamicArray(){
        this.array = new Object[capacity];
        //Calling constructor by initializing 'Object' array with new array with initialized capacity(10);
    }

    //Overloaded Constructor
    public DynamicArray(int capacity){
        this.capacity = capacity;
        //initialize capacity from input parameter
        this.array = new Object[capacity];
        //Calling constructor by initializing 'Object' array with new array with initialized parameter capacity;
    }

    public Object get(int index) {
        return array[index];
        //find input index to return the value in array
    }

    public void add(Object data){
        if (size >= capacity){
            grow();
        }
        array[size] = data;
        //Firstly, array is empty : array[0] : data being inserted at index 0
        size++;
        //After size increment , now array[1]:
        //repeat array[1].... data insertion until array => capacity;
    }

    public void insert(int index, Object data){
        if(size >= capacity){
            grow(); // Expand the array if it's full
        }
        // Start moving elements to the right from the end of the array up to the insert index
        for(int i = size; i > index; i--){
            // Implement decrement method:
            // Given size = 5, assume input index = 2:
            // --Looping start--
            // Initial check: i = 5
            // Condition 5 > 2 is true, so execute the logic inside the loop
            // In each iteration, copy the element from the previous index to the current index
            array[i] = array[i-1];
            // For the first iteration, array[5] = array[4]
            // This means copy the data from index 4 to index 5
            // Next iteration:
            // i = 4, condition 4 > 2 is true
            // array[4] = array[3], copy the data from index 3 to index 4
            // Loop continues until i = 3, condition 3 > 2 is true
            // array[3] = array[2], copy the data from index 2 to index 3
            // The loop exits when i = 2, condition 2 > 2 is false
        }
        // Insert the new data at the specified index
        array[index] = data; // Assume data = "X", array[2] = X;
        // "X" is inserted into array[2]

        // Increment the size to reflect the addition of a new element
        size++; // size was 5, incremented by 1, new size = 6
    }

    public void delete(Object data){
        // Loop through the array to find the first occurrence of the data.
        for(int i = 0; i < size; i++){
            // Check if the current element matches the data to be deleted.
            if(array[i] == data){
                // If the data is found at index i (e.g., i = 2 for array[2]), begin shifting all subsequent elements one position to the left.
                for(int j = 0; j < (size - i - 1); j++){
                    // Shift element from the right of the deletion point to the left.
                    // The expression (size - i - 1) determines how many elements need to be moved:
                    //   - size is the total number of elements in the array.
                    //   - i is the index of the element to be deleted (e.g., 2 for array[2]).
                    //   - Subtract 1 because you are starting the shift from the next element.
                    //   - J starts from 0 is only to find the maximum number of shifting required
                    //   - J index shall be used for further implying shifting logic
                    array[i + j] = array[i + j + 1];
                    // Example of operations if i = 2 (deleting array[2]):
                    //   - First iteration (j = 0): array[2] = array[3], shifts array[3] to array[2]
                    //   - Second iteration (j = 1): array[3] = array[4], shifts array[4] to array[3]
                }
                // After shifting, the last element in the array is now redundant.
                array[size - 1] = null;
                // Set the redundant last element to null to avoid loitering.

                // Decrement the size of the array because one element has been removed.
                size--;

                // Check if the array should be shrunk. This depends on whether the current size
                // is now less than or equal to a third of the capacity.
                if(size <= (int)(capacity / 3)){
                    shrink();  // Call shrink method to reduce the capacity of the array.
                }

                // Break out of the loop after handling the deletion to avoid deleting multiple instances.
                break;
            }
        }
    }


    public int search(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                //loop thru all array to find data resides at which index
                return i;
                //return index
            }
        }
        return -1;
        //if data not found , return -1
    }


    public void grow(){
        int newCapacity = (int)(capacity * 2);
        // Double the current capacity and store it in "newCapacity".
        // The casting to int is to ensure the result is a valid array size, although it is redundant here as the multiplication of two integers is an integer.

        Object[] newArray = new Object[newCapacity];
        // Create a new array "newArray" with a size equal to "newCapacity".
        // This new array will hold the expanded set of elements.

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
            // Copy each element from the old array "array" to the same position in the new array "newArray".
            // Loop example: if size = 3, it copies array[0] to newArray[0], array[1] to newArray[1], and array[2] to newArray[2].
        }

        capacity = newCapacity;
        // Update the "capacity" field of the array to the new capacity value.
        // This reflects that the array can now hold more elements.

        array = newArray;
        // Assign the new array "newArray" to the old array reference "array".
        // This effectively replaces the old array with the new, expanded array.
    }


    public void shrink(){
        int newCapacity = (int)(capacity / 2);
        // Halve the current capacity and store it in "newCapacity".
        // The casting to int ensures the result is a valid array size and rounds down any decimal.
        // This operation reduces the capacity to better match the current size if the array is underutilized.

        Object[] newArray = new Object[newCapacity];
        // Create a new array "newArray" with a size equal to "newCapacity".
        // This new array will now hold the elements in a more space-efficient manner.

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
            // Copy each element from the old array "array" to the same position in the new array "newArray".
            // Loop example: if size = 3, it copies array[0] to newArray[0], array[1] to newArray[1], and array[2] to newArray[2].
            // This ensures that all existing elements are preserved in the transition to a smaller array.
        }

        capacity = newCapacity;
        // Update the "capacity" field of the array to the new, reduced capacity value.
        // This change reflects that the array can now hold fewer elements but is more space-efficient.

        array = newArray;
        // Assign the new array "newArray" to the old array reference "array".
        // This effectively replaces the old, larger array with the new, smaller array.
    }

    public boolean isEmpty(){
        return size == 0;
        // Return true if the size is 0, indicating that there are no elements in the array.
        // This method is useful for quickly checking if the data structure is empty.
    }



    @Override
    public String toString() {
        String string = "";
        //initialize empty string with name 'string'
        for(int i = 0; i < capacity ; i++){
            //looping i only with data
            string += array[i] + ", ";
            //concatenate  string with current array + and ","
        }
        if (string != ""){
            string = "[" + string.substring(0,string.length()-2) + "]";
            //method to create new string with substring method if string is not empty
            //new string shall be modified where first element is being extract; 0
            //last element with -2 approach shall be extracted to create new string; string.length()-2
        }else{
            string = "[]";
        }
        return string;
    }
}
