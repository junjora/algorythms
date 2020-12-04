import Arrays.java;

class QuickSort{

  public static int partition(int arr[], int low, int high){
    int pivot = arr[high]; //choose pivot
    int i = (low-1); //index of smaller element
    for(int j=low; j<high; j++){
         // If current element is smaller than the pivot
         if(arr[j] < pivot){
             i++;
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return i+1;
  }

  void sortQuick(int arr[], int low, int high){
      if(low < high){
          //pi is partitioning index, arr[pi] is now at right place
          int pi = partition(arr, low, high);
          // Recursively sort elements before partition and after partition 
          sortQuick(arr, low, pi-1);
          sortQuick(arr, pi+1, high);
      }
   }
   
   public static void main(String args[]) { 
    System.out.println("Исходный массив");
    int arr[]=Arrays.createMassive(7,100);
    Arrays.printArray(arr);
    System.out.println("Отсортированный массив");
    Arrays.measureTime(()->QuickSort.sortQuick(arr));
    Arrays.printArray(arr);
  }
}
