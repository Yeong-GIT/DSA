package Test;

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
        dynamicArray.add("K");
        dynamicArray.insert(11,"L");
        dynamicArray.insert(12,"M");
        dynamicArray.insert(13,"N");
        dynamicArray.insert(14,"O");
        dynamicArray.insert(15,"P");
        dynamicArray.insert(16,"Q");
        dynamicArray.insert(17,"R");
        dynamicArray.insert(18,"S");
        dynamicArray.insert(19,"T");
        dynamicArray.insert(20,"U");
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        dynamicArray.delete("E");
        dynamicArray.delete("F");
        dynamicArray.delete("G");
        dynamicArray.delete("H");

        System.out.println(dynamicArray);
        System.out.println("Size : " + dynamicArray.size);
        System.out.println("Capacity :" + dynamicArray.capacity);
        System.out.println("Is Array Empty? :" + dynamicArray.isEmpty());
        System.out.println("H is at array :" + dynamicArray.search("U"));
        System.out.println("Array[11] is :" + dynamicArray.get(11));
    }
}
