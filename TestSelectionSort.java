import java.util.Random; 

public class TestSelectionSort {
    public static void main(String[] args) {
        Random r = new Random(4); 
        
        int[] arr1 = new int[10]; 
        int[] arr2 = new int[10]; 
        int[] arr3 = new int[10]; 

        // numbers btw 0 and 10, inclusive
        for (int i = 0; i < 10; i++) {
            arr1[i] = r.nextInt(11); 
            arr2[i] = r.nextInt(11); 
            arr3[i] = r.nextInt(11); 
        }

        SortingAlgorithms selectionSortArray = new SortingAlgorithms(arr1);
        SortingAlgorithms bubbleSortArray = new SortingAlgorithms(arr2); 
        SortingAlgorithms insertionSortArray = new SortingAlgorithms(arr3); 

        System.out.println("selectionSortArray Before sorting:" + selectionSortArray); 
        System.out.println(); 

        selectionSortArray.selectionSort(false);
        System.out.println("selectionSortArray after selectionSort" + selectionSortArray);
        System.out.println();

        bubbleSortArray.bubbleSort(false);

        // System.out.println(insertionSortArray.toString());
        insertionSortArray.insertionSort(true); 
        // System.out.println(insertionSortArray.toString());
    

    }
}