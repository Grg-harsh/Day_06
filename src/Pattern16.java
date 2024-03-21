import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstr = 1;
        int nspace = (2*n-3);

        for(int row = 1; row <= n; row++){
            int num = 1;
            for(int i = 1; i <= nstr; i++){
                System.out.print(num+"\t");
                num = num+1;
            }
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            for(int i = 1; i <= nstr; i++){
                System.out.print("*\t");
            }
            System.out.println();
            nstr = nstr+1;
            nspace = nspace-2;
        }
    }
}
