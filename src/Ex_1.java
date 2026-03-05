import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());

        if (n <= 0) {
            System.out.println("Loi: So luong sinh vien ko hop le");
            return;
        }

        List<String> list = new ArrayList<>();
        System.out.println("Nhập tên từng sinh viên:");

        for (int i = 0; i < n; i++) {
            System.out.print("Sinh viên " + (i + 1) + ": ");
            String name = sc.nextLine();
            list.add(name);
        }

        String longest = list.get(0);
        for (String s : list) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareToIgnoreCase(list.get(j + 1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        int countA = 0;
        for (String s : list) {
            if (s.substring(0, 1).equalsIgnoreCase("a")) {
                countA++;
            }
        }

        System.out.println("Longest name: " + longest);

        System.out.print("Sorted list: ");
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println("\nNumber of names starting with A: " + countA);
    }
}