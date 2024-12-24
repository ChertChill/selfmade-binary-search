package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // BinarySearch в SelfmadeArrays
        System.out.println("-------------------------");
        System.out.println("ARRAY METHODS");
        System.out.println("-------------------------");
        System.out.println();

        // Byte type methods
        byte[] byteArray = {1, 3, 5, 7, 9};
        System.out.println("Byte type - Index of 5 in byteArray: " + Arrays.toString(byteArray));
        System.out.println("------------------------------------");
        System.out.println("First:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(byteArray, (byte) 5));
        System.out.println("Old: " + Arrays.binarySearch(byteArray, (byte) 5));
        System.out.println("----------");
        System.out.println("Second:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(byteArray, 1, 4,  (byte) 5));
        System.out.println("Old: " + Arrays.binarySearch(byteArray, 1, 4, (byte) 5));
        System.out.println();

        // Char type methods
        char[] charArray = {'a', 'c', 'e', 'g', 'i'};
        System.out.println("Char type - Index of 'e' in charArray: " + Arrays.toString(charArray));
        System.out.println("--------------------------------------");
        System.out.println("First:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(charArray, 'e'));
        System.out.println("Old: " + Arrays.binarySearch(charArray, 'e'));
        System.out.println("----------");
        System.out.println("Second:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(charArray, 1, 4, 'e'));
        System.out.println("Old: " + Arrays.binarySearch(charArray, 1, 4, 'e'));
        System.out.println();


        // Double type methods
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Double type - Index of 3.3 in doubleArray: " + Arrays.toString(doubleArray));
        System.out.println("------------------------------------------");
        System.out.println("First:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(doubleArray, 3.3));
        System.out.println("Old: " + Arrays.binarySearch(doubleArray, 3.3));
        System.out.println("----------");
        System.out.println("Second:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(doubleArray, 1, 4, 3.3));
        System.out.println("Old: " + Arrays.binarySearch(doubleArray, 1, 4, 3.3));
        System.out.println();

        // Float type methods
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.println("Float type - Index of 4.4 in floatArray: " + Arrays.toString(floatArray));
        System.out.println("---------------------------------------");
        System.out.println("First:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(floatArray, 4.4f));
        System.out.println("Old: " + Arrays.binarySearch(floatArray, 4.4f));
        System.out.println("----------");
        System.out.println("Second:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(floatArray, 1, 4, 4.4f));
        System.out.println("Old: " + Arrays.binarySearch(floatArray, 1, 4, 4.4f));
        System.out.println();

        // Int type methods
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println("Int type - Index of 30 in intArray: " + Arrays.toString(intArray));
        System.out.println("-----------------------------------");
        System.out.println("First:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(intArray, 30));
        System.out.println("Old: " + Arrays.binarySearch(intArray, 30));
        System.out.println("----------");
        System.out.println("Second:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(intArray, 1, 4, 30));
        System.out.println("Old: " + Arrays.binarySearch(intArray, 1, 4, 30));
        System.out.println();

        // Long type methods
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        System.out.println("Long type - Index of 300L in longArray: " + Arrays.toString(longArray));
        System.out.println("---------------------------------------");
        System.out.println("First:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(longArray, 300L));
        System.out.println("Old: " + Arrays.binarySearch(longArray, 300L));
        System.out.println("----------");
        System.out.println("Second:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(longArray, 1, 4, 300L));
        System.out.println("Old: " + Arrays.binarySearch(longArray, 1, 4, 300L));
        System.out.println();

        // Short type methods
        short[] shortArray = {10, 20, 30, 40, 50};
        System.out.println("Short type - Index of 40 in shortArray: " + Arrays.toString(shortArray));
        System.out.println("---------------------------------------");
        System.out.println("First:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(shortArray, (short) 40));
        System.out.println("Old: " + Arrays.binarySearch(shortArray, (short) 40));
        System.out.println("----------");
        System.out.println("Second:");
        System.out.println("New: " + SelfmadeArrays.binarySearch(shortArray, 1, 4, (short) 40));
        System.out.println("Old: " + Arrays.binarySearch(shortArray, 1, 4, (short) 40));
        System.out.println();

        // Comparator methods
        String[] comparatorArray = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.println("Comparator - Index of 40 in shortArray: " + Arrays.toString(comparatorArray));
        System.out.println("---------------------------------------");
        System.out.println("First (naturalOrder):");
        System.out.println("New: " + SelfmadeArrays.binarySearch(comparatorArray, "Charlie", Comparator.naturalOrder()));
        System.out.println("Old: " + Arrays.binarySearch(comparatorArray, "Charlie", Comparator.naturalOrder()));
        System.out.println("----------");
        System.out.println("Second (naturalOrder):");
        System.out.println("New: " + SelfmadeArrays.binarySearch(comparatorArray, 1, 4, "Charlie", Comparator.naturalOrder()));
        System.out.println("Old: " + Arrays.binarySearch(comparatorArray, 1, 4, "Charlie", Comparator.naturalOrder()));
        System.out.println();



        // BinarySearch в SelfmadeCollections
        System.out.println("-------------------------");
        System.out.println("COLLECTION METHODS");
        System.out.println("-------------------------");
        System.out.println();

        // Comparable method
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println("Comparable - Index of 5: " + numbers);
        System.out.println("------------------------");
        System.out.println("New: " + SelfmadeCollections.binarySearch(numbers, 5));
        System.out.println("Old: " + Collections.binarySearch(numbers, 5));
        System.out.println();

        // Comparator method
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.println("Comparator - Index of Charlie: " + names);
        System.out.println("------------------------------");
        System.out.println("New: " + SelfmadeCollections.binarySearch(names, "Charlie", Comparator.naturalOrder()));
        System.out.println("Old: " + Collections.binarySearch(names, "Charlie", Comparator.naturalOrder()));
    }
}