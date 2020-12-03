import Arrays.java

class BinarySearch{
  public static int binarySearch(int arr[], int x){
    int l=0, n=arr.length-1;
    while(l <= n){
        int m = l+(n-l)/2;
        if(arr[m]==x){
            return m;
        }
        if(arr[m] < x){
            l=m+1;
        }else{
            r=m-1;
        }
    }
    return -1;
  }
  
  public static void main(String args[]) { 
    BinarySearch bs = new BinarySearch();
    Arrays a = new Arrays();
    System.out.println("Исходный массив");
    int arr[]=a.createMassive(7,100);
    a.printArray(arr);
    System.out.println("Отсортированный массив");
    a.measureTime(()->bs.binarySearch(arr));
    a.printArray(arr);
  }
}
