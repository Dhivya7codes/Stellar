package day3;
import java.util.Scanner;

public class departmentstore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       
        System.out.print("Enter the number of products: ");
        int n = s.nextInt();
        

        int[] sNo = new int[n];
        int[] prono = new int[n];
        int[] Qty = new int[n];
        float[] amount = new float[n];
        float[] total = new float[n];
        
        int con = 1; 
        int i = 0;
        while (i < n && con == 1) {
            System.out.print("Enter Serial Number: ");
            sNo[i] = s.nextInt();
            
            System.out.print("Enter Product Number: ");
            prono[i] = s.nextInt();
            
            System.out.print("Enter Quantity: ");
            Qty[i] = s.nextInt();
            
            System.out.print("Enter Amount: ");
            amount[i] = s.nextFloat();
            
            total[i] = Qty[i] * amount[i];  

            System.out.print("Do you want to continue (1/0): ");
            con = s.nextInt();
            
            i++;  
        }

        
        System.out.println("\nKRCE DEPARTMENTAL STORE \nSAMAYAPURAM \n9987361235");
        System.out.println("S.no  ProdNo  Qty    Amt    Total");

        for (int j = 0; j < i; j++) { 
            System.out.println(sNo[j] + "     " + prono[j] + "       " + Qty[j] + "     " + amount[j] + "    " + total[j]);
        }

       
    }
}
