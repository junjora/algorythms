import Arrays.java;

class BubbleSort{
  
  public static void bubbleSort(int arr[]){
    n=arr.length;
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

  public static void main(String args[]) { 
    BubbleSort bs = new BubbleSort();
    Arrays a = new Arrays();
    System.out.println("Исходный массив");
    int arr[]=a.createMassive(7,100);
    a.printArray(arr);
    System.out.println("Отсортированный массив");
    a.measureTime(()->bs.bubbleSort(arr));
    a.printArray(arr);
  }
}
