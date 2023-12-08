package week_14.live_class;

import java.util.ArrayList;
import java.util.HashSet;

public class AbsulateDuplicate {
    public static void main(String[] args) {


    // 10 rastgele tamsayı içeren bir ArrayList oluştur
    ArrayList<Integer> nums = generateRandomArrayList(10);
    int k = 3;

        System.out.println(nums);
    // Fonksiyonu çağır ve sonucu yazdır
    boolean result = containsNearbyDuplicate(nums, k);
        System.out.println("Result: " + result);
}

    // 10 rastgele tamsayı içeren bir ArrayList oluşturan fonksiyon
    private static ArrayList<Integer> generateRandomArrayList(int size) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add((int) (Math.random() * 20)); // 0 ile 99 arasında rastgele tamsayılar
        }
        return nums;
    }

    // İki farklı indeks i ve j'nin varlığını ve abs(i - j) <= k koşulunu kontrol eden fonksiyon
    private static boolean containsNearbyDuplicate(ArrayList<Integer> nums, int k) {
        if (nums == null || nums.size() <= 1 || k <= 0) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
//            if (i > k) {
//                set.remove(nums.get(i - k - 1));
//            }
//            System.out.println(set);

            if (!set.add(nums.get(i))) {
                return true;
            }
        }

        return false;
    }


}
