import java.util.ArrayList;
import java.util.List; 

public class Chapter10Practice {

    public static List<Integer> stablePartition(int[] arr, int pivot) {
        List<Integer> lessOrEqual = new ArrayList<>(); 
        List<Integer> greaterThan = new ArrayList<>();
        
        // O(n)
        for (int num : arr) {
            if (num <= pivot) {
                lessOrEqual.add(num); 
            } else {
                greaterThan.add(num); 
            }
        }

        lessOrEqual.addAll(greaterThan); // O(n)
        return lessOrEqual; 
        
    } // final O is O(n) because n + n = 2n
    
}
