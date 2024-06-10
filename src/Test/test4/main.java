package Test.test4;

public class main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.insert(0,"E");
        dynamicArray.insert(0,"F");
        dynamicArray.insert(0,"G");
        dynamicArray.insert(0,"H");
        dynamicArray.insert(0,"I");
        dynamicArray.insert(0,"J");
        dynamicArray.insert(0,"K");
        dynamicArray.delete("K");
        dynamicArray.delete("J");
        dynamicArray.delete("I");
        dynamicArray.delete("H");
        dynamicArray.delete("G");
        dynamicArray.delete("F");

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.capacity);
        System.out.println(dynamicArray.search("A"));
        System.out.println(dynamicArray.get(0));
    }
}
