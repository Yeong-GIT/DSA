package Array;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("F");
        dynamicArray.delete("E");
        dynamicArray.delete("D");

//        dynamicArray.insert(0,"X");
//        dynamicArray.delete("A");
//
        System.out.println(dynamicArray);
        ;
        System.out.println("Size : " + dynamicArray.size);
        System.out.println("Capacity : " + dynamicArray.capacity);
        System.out.println("Empty : " + dynamicArray.isEmpty());
//        System.out.println("Index 0 is : " + dynamicArray.get(0))
//        System.out.println("C is at array : " + dynamicArray.search("C"));
//        System.out.println("A is at array : " + dynamicArray.search("A"));
    }
}
