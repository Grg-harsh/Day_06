import java.util.Scanner;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstr = n;
        int nspace = 0;
        for(int row = 1; row <= n; row++){
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            for(int i = 1; i <= nstr; i++){
                if((row > 1 && row <= n/2) && (i > 1 && i < nstr)){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }

            }
            System.out.println();
            if(row <= n/2){
                nspace = nspace+1;
                nstr = nstr-2;
            }else{
                nspace = nspace-1;
                nstr = nstr+2;
            }

        }
    }
}
