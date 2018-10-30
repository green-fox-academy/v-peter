public class Method {

    public static final int MY_NUMBER = 5;

    public static void main(String[] args) {
        System.out.println(MY_NUMBER);
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println(i);

        int[] myArray2 = new int[3];

        int[] myArray = {1, 2};

        for (int item : myArray) {
            System.out.println(item);
        }

        int[][] maratrix = {{1, 4}, {3, 4, 3}};
        System.out.println(maratrix);
        int[][] maratrix2 = {{1, 4}, {3, 4, 3}};
        System.out.println(maratrix2);


    }


}
