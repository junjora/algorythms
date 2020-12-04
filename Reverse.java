import Arrays.java;

class Reverse{
  public static void reverse(int arr[]){
    int left=0, right=arr.length-1;
    for(left=0; left<right; left++, right--){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
  }
  
  public static void main(String args[]) { 
    System.out.println("Исходный массив");
    int arr[]=Arrays.createMassive(7,100);
    Arrays.printArray(arr);
    System.out.println("Отсортированный массив");
    Arrays.measureTime(()->Reverse.reverse(arr));
    Arrays.printArray(arr);
  }
}
