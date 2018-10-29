import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, please:");
        int a = sc.nextInt();
        //sorok (a)
        for (int i = 0; i < a; i++){
            //első és utolsó sorok
            if (i == 0 || i == a-1) {
                for (int j = 0; j < a; j++) System.out.print("%");
                System.out.println();
            }
            //többi sor
            else {
                //oszlopok (a)
                for (int j = 0; j < a; j++){
                    //első és utolsó oszlop
                    if (j == 0 || j == a-1) System.out.print("%");
                    //átló
                    else if(j == i) System.out.print("%");
                    //szóközök
                    else System.out.print(" ");
                }
                System.out.println();
            }

        }




    }
}
