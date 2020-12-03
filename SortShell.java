import Arrays.java;

class Shell{

  void sortShell(int arr[]) {
      //amount of array's elements
      int n=arr.length;
      //after each iteration, step div on 2
      for(int d=n/2; d>0; d/=2){
          //
          for(int i=d; i<n; i++)
          {
              for(int j=i; j>=d; j--)
              {
                  /*if a[j] more than arr[j+d] than 
                  swap them*/
                  if(arr[j-d]>arr[j])
                  {
                      int temp=arr[j];
                      arr[j]=arr[j-d];
                      arr[j-d]=temp;
                  }
              }
          }
      }
  }
  
  public static void main(String args[]) { 
    Shell s = new Shell();
    Arrays a = new Arrays();
    System.out.println("Исходный массив");
    int arr[]=a.createMassive(7,100);
    a.printArray(arr);
    System.out.println("Отсортированный массив");
    a.measureTime(()->s.sortShell(arr));
    a.printArray(arr);
  }
}
