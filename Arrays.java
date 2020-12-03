 import java.util.Date;
 class Arrays{
   //input elapsed time
    private static void measureTime(Runnable task) {
            long startTime = System.currentTimeMillis();
            task.run();
            long elapsed = System.currentTimeMillis() - startTime;
            System.out.println("Затраченное время: " + elapsed + " ms");
    }

    //input array
    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //create array with amout of elements equal 'n' and with diapason 'x'
    public int[] createMassive(int n, int x){
        int arr[] = new int [n];
        for(int i=0; i<n;i++){
            arr[i] = (int)(Math.random()*x);
        }
        return arr;
    }
  }
