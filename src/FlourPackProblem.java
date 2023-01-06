public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(5, 3, 24)); //false
        System.out.println(canPack(2, 1, 11)); // true
        System.out.println(canPack(2, 1, 5)); //true
        System.out.println(canPack(4, 18, 19)); //true
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int remainFlour;
        while (bigCount * 5 > goal) {
            bigCount--;
        }
        remainFlour = goal - (5 * bigCount);
        if (remainFlour == 0) {
            return true;
        }
        return remainFlour <= smallCount;
    }

}
