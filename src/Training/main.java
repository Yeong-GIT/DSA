package Training;

import Training.DynamicArray;

public class main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");
        dynamicArray.add("I");
        dynamicArray.add("J");

        dynamicArray.insert(0, "X");
        dynamicArray.insert(0, "Y");
        dynamicArray.insert(0, "Z");

        dynamicArray.delete("J");
        dynamicArray.delete("C");
        dynamicArray.delete("D");

        System.out.println(dynamicArray);
        System.out.println("Size : "+ dynamicArray.size);
        System.out.println("Capacity :" + dynamicArray.capacity);
        System.out.println("Array at index 2 is : " + dynamicArray.get(2));
        System.out.println("D is at index " + dynamicArray.search("D"));
        System.out.println("Is Array Empty? : " + dynamicArray.isEmpty());
    }
}
