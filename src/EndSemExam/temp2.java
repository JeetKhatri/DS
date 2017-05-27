package EndSemExam;
import java.io.*;
import java.util.*;

public class temp2 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int d[] = new int[n];
        int ra[] = new int[n/2];
        int rd[] = new int[n/2];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
            d[i]= sc.nextInt(); 
        }
       
        int cnt=1; 
        ra[cnt]= a[0];
        rd[cnt]= d[0];
            for(int j=1;j<n;j++){
                for(int i=0;i<rd.length;i++){
                    if(a[j] < rd[i]){
                        cnt++;
                        ra[cnt] = a[j];
                        rd[cnt] = d[j];
                        break;
                    }
                }
          /*      if(d[j] > a[j+1]){
                       ra[cnt]= a[j+1];
                       rd[cnt]= d[j+1];
                       cnt++;
                    System.out.println(d[j]+ " "+a[j+1]+" <");
                }else{
                     System.out.println(d[j]+ " "+a[j+1]);
                    }*/
                
            }
      //  System.out.println(ra.length);  
    }
}