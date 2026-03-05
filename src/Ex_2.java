import java.util.*;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = Integer.parseInt(sc.nextLine());
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println("Nhập các số: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedKeys = new ArrayList<>(map.keySet());
        for (int i = 0; i < sortedKeys.size() - 1; i++) {
            for (int j = 0; j < sortedKeys.size() - i - 1; j++) {
                if (sortedKeys.get(j) > sortedKeys.get(j + 1)) {
                    Collections.swap(sortedKeys, j, j + 1);
                }
            }
        }

        int maxCount = 0;
        int numMax = 0;

        for (int key : sortedKeys) {
            int count = map.get(key);
            System.out.println(key + " xuất hiện: " + count + " lần");
            
            if (count > maxCount) {
                maxCount = count;
                numMax = key;
            }
        }
        System.out.println("Số xuất hiện nhiều nhất: " + numMax + " (" + maxCount + " lần)");
    }
}