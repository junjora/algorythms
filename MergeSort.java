  import Arrays.java
  
  class MergeSort{
  
    public static void sort(int arr[], int left, int right){
      if(left < right){
        int mid = (left+right)/2;
        sort(arr, left, mid);// sort the one half of array
        sort(arr, mid+1, right);// sort the other half of array
        mergeSort(arr, left, mid, right);        
      }
    }
    
    private static void mergeSort(int arr[], int left, int mid, int right){
      int n1 = mid-left+1; //range if first subarray
      int n2 = right-mid; //range if second subarray
      //create two subarrays
      int L[] = new int[n1];
      int R[] = new int[n2];
      //copy elements to temo array
      for(int i=0; i < n1; i++){
        L[i] = arr[left+i];
      }
      for(int j=0; j < n2; i++){
        R[j] = arr[mid+j+1];
      }
      //now, merge subarrays, whom was created above
      int i=0, j=0, k=left;//init indexes for arrays
      while(i < n1 && j < n2){
        if(L[i] <= R[j]){
          arr[k]=L[i]; i++;
        }else{
          arr[k]=R[j]; j++;
        }
        k++;
      }
      //copy remaining elements if L[] if any
      while(i < n1){
        arr[k]=L[i];
        i++;k++;
      }
      //copy remaining elements if R[] if any
      while(j < n2){
        arr[k]=R[j];
        j++;k++;
      }
    }
    
    public static void main(String args[]) { 
    System.out.println("Исходный массив");
    int arr[]=Arrays.createMassive(7,100);
    Arrays.printArray(arr);
    System.out.println("Отсортированный массив");
    int left = 0;//the first element
    int right = arr.length-1;//the last element
    Arrays.measureTime(()->MergeSort.sort(arr, left, right));
    Arrays.printArray(arr);
  }
  }
