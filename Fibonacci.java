import Arrays.java;

class Fibonacci{

  //recursive method
  public static int fiboRec(int n){
    if (n<=1){
        return n;
    }
    return fiboRec(n-1)+fiboRec(n-2);
  }
  
  //dynamic method
  public static int fibo(int n){
    int arr[]=new int[n+2];
    arr[0]=0;
    arr[1]=1;
    for(int i=2; i<=n; i++){
        arr[i] = arr[i-1]+arr[i-2];
    }
    return arr[n];
  }
  
  public static void main(String args[]) { 
    Fibonacci f = new Fibonacci();
    Arrays a = new Arrays();
    System.out.println("Recursive method of find number of Fibonacci");
    a.measureTime(()->f.fiboRec(9));//34
    System.out.println("Dynamic method of find number of Fibonacci");
    a.measureTime(()->f.fibo(9));//34
    a.printArray(arr);
  }
}
