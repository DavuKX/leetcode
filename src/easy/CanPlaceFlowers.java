package easy;

public class CanPlaceFlowers {
    static public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            boolean canPlace = true;

            if (n == 0) {
                break;
            }

            if (flowerbed[i] == 1) {
                continue;
            }

            if (i > 0) {
                if (flowerbed[i - 1] == 1) {
                   canPlace = false;
                }
            }

            if (i < flowerbed.length - 1) {
                if (flowerbed[i + 1] == 1) {
                    canPlace = false;
                }
            }

            if (canPlace) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n == 0;
    }
}
