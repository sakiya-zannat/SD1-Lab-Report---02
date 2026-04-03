
package intermediate;

public class FindSmallestNumber {
     public static void main(String[] args) {
         int []arr={50,40,200,20,100};
         int min=arr[0];
         
         for(int i=0;i<arr.length;i++){
             if(arr[i]<min){
                 min=arr[i];
             }
         }System.out.println("Smallest Number = "+min);
     }
}
