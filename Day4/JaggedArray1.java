package day4;
import java.util.Scanner;
public class JaggedArray1 {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter number of rows: ");
    	int rows = scanner.nextInt();
    	
    	 int[][] jagged = new int[rows][];

         for (int i = 0; i < rows; i++) {
             System.out.print("Enter number of columns for row " + i + ": ");
             int columns = scanner.nextInt();
             jagged[i] = new int[columns];

             System.out.println("Enter elements for row " + i + ":");
             for (int j = 0; j < columns; j++) {
                 jagged[i][j] = scanner.nextInt();
             }
         }

         System.out.println("\nJagged Array:");
         for (int i = 0; i < jagged.length; i++) {
             for (int j = 0; j < jagged[i].length; j++) {
                 System.out.print(jagged[i][j] + "  ");
             }
             System.out.println();
         }

         scanner.close();
     }
 }
    	





    	
   /*	
    	
    	
    	int[][] jagged=new int[rows][];
    	jagged[0]=new int[3];
        jagged[1]=new int[2];
        jagged[2]=new int[4];
        
        int value=1;
        for(int i=0; i<jagged.length; i++) {
        	for(int j=0; j<jagged[i].length; j++) {
        		jagged[i][j]=value++;
        	}
        }
        System.out.println("Jagged Array:");
        for(int i=0; i<jagged.length; i++) {
        	for(int j=0; j<jagged[i].length; j++) {
        		System.out.print(jagged[i][j]+"");
        	}
        	System.out.println();
        }
        		
        		
        
    }
}
*/