
public class SortingAlgorithms {
    private int[] array; 

    public SortingAlgorithms(int[] array) {
        this.array = array; 
    } 
   
    
    private static int indexOfLargest(int[] array, int length) {
        int indexOfLargest = 0; 

        for (int i = 1; i < length; i++) {
            if (array[i] > array[indexOfLargest]) {
                indexOfLargest = i; 
            } 
        }

        return indexOfLargest; 
    }
    
    // Selection Sort continues until you have swapped n - 1 elements of the array
    public void selectionSort(boolean print) {
        int indexOfLargest; 
        if (print) {
            System.out.println("Before selection sort: " + this.toString());
        }
        for (int i = this.array.length - 1; i > 0; i--) {
            indexOfLargest = indexOfLargest(this.array, i+1); 

            int temp = this.array[i];
            this.array[i] = this.array[indexOfLargest];
            this.array[indexOfLargest] = temp; 
            System.out.printf("After index = %d: " + this.toString() + "\n", i);

        }
    }

    // requires two passes
    // ascending order
    public void bubbleSort(boolean print) {
        boolean sorted = false; 
        int temp; 

        for (int pass = 1; pass < this.array.length && !sorted; pass++) {
           if (print) {
            System.out.println("Going into pass #" + pass + ": " + this.toString());
           }
            sorted = true; 
            
            for (int i = 0; i < this.array.length - 1; i++) { // because we have to compare at index i and at index i+1, so we do not want to be out of bounds
                if (this.array[i] > this.array[i+1]) {
                    if (print) {
                        System.out.println("\tGoing into i = " + i + ": " + this.toString());
                    }

                    temp = this.array[i+1]; 
                    this.array[i+1] = this.array[i];
                    this.array[i] = temp;  
                    sorted = false; 

                }
            }
        }
    }

    public void insertionSort(boolean print) {
        int sortedN = 1; // length of sorted array
        int unsortedN = this.array.length - 1; // length of unsorted array
        int current; // we will use this to check if the first number in the unsorted array is less than the last number in the sorted array
        int temp; 

        if (print) {
            System.out.println("Before insertionSort: " + this.toString());
        }

        // n - 1 iterations
        for (int i = 0; i < this.array.length - 1; i++) { // the first num in the array is automatically part of the "sorted" section, so we only look at n-1 elements in the array
            current = this.array[sortedN]; // the first number in the unsorted array
            if (print) {
                System.out.println("i = " + i);
            }

            // best case: 0 times, worst case: n times 
            for (int j = sortedN; j > 0 && current < this.array[j-1]; j--) {
                temp = this.array[j-1]; 
                this.array[j-1] = current; // n times
                this.array[j] = temp; // n times
                
                if (print) {
                    System.out.printf("\tAfter j = %d: " + this.toString() + "\n", j);
                }

            }
            sortedN++; 
            unsortedN--; 

           
        }
    }

    // mergeSort halves the array
    // then mergeSort calls itself to sort the halves
    // 1. sorts first half of array
    // 2. sorts second half of array
    // 3. merges halves



    // helper function for mergeSort
    public void merge(boolean print, int[] tempArr, int first, int last, int mid) { 
        int first1 = first; 
        int last1 = mid; 
        int first2 = mid + 1; 
        int last2 = last; 
        
        
        int index = first1; // next available location in tempArray

        while ((first1 <= last1) && (first2 <= last2)) {
            if (this.array[first1] < this.array[first2]) {
                tempArr[index] = this.array[first1]; 
                first1++; 
            } else {
                tempArr[index] = this.array[first2]; 
                first2++; 
            }

            index++; 
        } // end while

        while (first1 <= last1) {
            tempArr[index] = theArr[first1]; 
            first1++; 
            index++; 
        } // end while

        while (first2 <= last2) {
            tempArr[index] = theArr[first2];
            first2++; 
            index++; 
        } // end while

        for (index = first; index <= last; index++) {
            this.array[index] = tempArr[index]; 
        }
        
    }

    private int[] quickSort() {

    }
    private int[] partitionHelper() {
        int randomPivotIndex = (int) (Math.random()*this.array.length); 
        int temp; 

        temp = this.array[0]; 
        this.array[0] = this.array[randomPivotIndex]; 
        this.array[randomPivotIndex] = temp; 

        for (int i = 1; i < this.array.length; i++) {
            if (this.arra)
        }
    }

    

    @Override 
    public String toString() {
        String str = "[";  

        for (int i = 0; i < this.array.length; i++) {
            str = str + this.array[i]; 

            if (i != this.array.length - 1) {
                str = str + ", "; 
            }
        }
        str = str + "]"; 

        return str; 
    }
}