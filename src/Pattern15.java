import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = n/2;
        int nstr = 1;
        int num = 1;
        for(int row = 1; row <= n; row++){
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            for(int i = 1; i <= nstr; i++){
                int temp = num;
                if(i > 1 && i < nstr){
                    temp = temp +1;
                    System.out.print(temp+"\t");
                }else{
                    System.out.print(num+"\t");
                }

            }
            System.out.println();
            if(row <= n/2){
                nspace = nspace-1;
                nstr = nstr+2;
                num = num+1;
            }else{
                nspace = nspace+1;
                nstr = nstr-2;
                num = num-1;
            }
        }
    }
}
