package Test.test2;

public class main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(6);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.insert(2, "X");
        dynamicArray.insert(3, "Y");
        dynamicArray.insert(4, "Z");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        dynamicArray.delete("Z");

        System.out.println(dynamicArray);
        System.out.println("Size : " + dynamicArray.size);
        System.out.println("Capacity : " + dynamicArray.capacity);
        System.out.println("Get array[3] is : " + dynamicArray.get(3));
        System.out.println("Search C is at : " + dynamicArray.search("C"));
    }
}
