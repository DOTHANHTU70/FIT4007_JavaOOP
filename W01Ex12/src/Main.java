import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số thứ nhất: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập số thứ hai: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập toán tử (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Không thể chia cho 0.");
                    }
                    result = (double) num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Toán tử không hợp lệ.");
            }

            System.out.println("Kết quả: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        scanner.close();
    }
}
