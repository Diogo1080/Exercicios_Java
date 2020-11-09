package a4_loops.tree;

public class Tree {
    public static void main(String[] args) {
        int z = 0;
        int r = 0;
        int dots;
        int spaces;
        int trunk = 9;

        for (int i = 10; i > 0; i--) {
            spaces = i - 1;
            dots = 2 * r + 1;
            r++;
            while (z < spaces) {
                System.out.print(" ");
                z++;
                if (z == spaces) {
                    for (int x = 0; x < dots; x++) {
                        System.out.print("*");
                    }
                }
            }
            z = 0;
            if (i == 1) {
                for (int c = 0; c < 2; c++) {
                    while (z < trunk) {
                        System.out.print(" ");
                        z++;
                    }
                    System.out.println("*");
                    z = 0;
                }
            } else {
                System.out.println();
            }
        }
    }
}
