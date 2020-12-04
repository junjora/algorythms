import Arrays.java;

class BubbleSort{
  
  public static void bubbleSort1(int arr[]){
    int n=arr.length;
    for(int i=0; i < n; i++){
      for(int j=0; j < n-i-1; j++){
        if(arr[i] > arr[i+1]){
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
      }
    }
  }
  
  //other realization
  public static void bubbleSort2(int arr[]){
    int n=arr.length;
    boolean isSort=false;
    while(!isSort){
      isSort=true;
      for(int i=0; i < n; i++){
          if(arr[i] > arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            isSort=false;
          }
        }
      }
    }
  }
  
  public static void main(String args[]) { 
    System.out.println("Исходный массив");
    int arr1[]=Arrays.createMassive(7,100);
    Arrays.printArray(arr1);
    System.out.println("Отсортированный массив");
    Arrays.measureTime(()->BubbleSort.bubbleSort(arr1));
    Arrays.printArray(arr1);
    System.out.println("Исходный массив");
    int arr2[]=Arrays.createMassive(7,100);
    Arrays.printArray(arr2);
    System.out.println("Отсортированный массив");
    Arrays.measureTime(()->BubbleSort.bubbleSort(arr2));
    Arrays.printArray(arr2);
  }
}
