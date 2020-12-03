import Arrays.java;

class Reverse{
  public static void reverse(int arr[]){
    int left=0,right=0;
    right=arr.length-1;
    for(left=0; left<right; left++, right--){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
  }
  
  public static void main(String args[]) { 
    Reverse r = new Reverse();
    Arrays a = new Arrays();
    System.out.println("Исходный массив");
    int arr[]=a.createMassive(7,100);
    a.printArray(arr);
    System.out.println("Отсортированный массив");
    a.measureTime(()->r.Reverse(arr));
    a.printArray(arr);
  }
}
