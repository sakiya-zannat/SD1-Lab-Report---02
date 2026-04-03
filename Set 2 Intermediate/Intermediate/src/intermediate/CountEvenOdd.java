
package intermediate;

public class CountEvenOdd {
     public static void main(String[] args) {
         int[]arr={10,25,20,15,37,50,77};
         
         int even =0,odd =0;
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
             if(arr[i]%2==0){
                 even++;
             }else{
                 odd++;
                              }
         }System.out.println("\nEven = "+even);
         System.out.println("Odd = "+odd);
     }
}
