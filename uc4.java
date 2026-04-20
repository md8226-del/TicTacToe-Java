public class uc4 {

    public static int[] getRowCol(int slot) {
        int index = slot - 1;
        int row = index / 3;
        int col = index % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        int slot = 5;
        int[] position = getRowCol(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}