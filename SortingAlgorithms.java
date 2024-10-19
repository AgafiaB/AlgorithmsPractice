
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
        int current; 
        int temp; 

        for (int i = 0; i < this.array.length - 1; i++){
            current = this.array[sortedN]; // the first number in the unsorted array
            
            for (int j = sortedN; j > 0 && current < this.array[j-1]; j--) {
                temp = this.array[j-1]; 
                this.array[j-1] = current; 
                this.array[j] = temp; 

            }
            sortedN++; 
            unsortedN--; 

           
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