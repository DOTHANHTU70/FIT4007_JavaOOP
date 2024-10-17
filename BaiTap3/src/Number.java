import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập một chuỗi: ");
            int convertedNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Giá trị số nguyên sau khi chuyển đổi: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Chuỗi không hợp lệ. Vui lòng nhập một chuỗi số nguyên.");
        }

    }
}