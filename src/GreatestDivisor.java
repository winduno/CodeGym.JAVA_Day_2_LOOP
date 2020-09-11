import java.util.Scanner;

public class GreatestDivisor {
    public static void main(String[] args) {
        int a, b;
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a đi anh zai!!");
        input = scanner.nextLine();

        if (isStringInteger(input)){
            a = Integer.parseInt(input);

            System.out.println("Nhập số b nữa đi thôi anh zai!!");
            input = scanner.nextLine();

            if (isStringInteger(input)){
                b = Integer.parseInt(input);

                a = Math.abs(a);
                b = Math.abs(b);

                if (a == 0 || b == 0){
                    System.out.println("Tìm ước chung lớn nhất của 0?? Điên à??");
                }
                else{
                    while (a != b){
                        if (a > b){
                            a = a - b;;
                        }
                        else{
                            b = b - a;
                        }
                    }

                    System.out.println("Ước chung lớn nhất là: " + a);
                }
            }
            else{
                System.out.println("Bảo là nhập số cơ mà!!");
            }
        }
        else{
            System.out.println("Nhập số!!!!");
        }

    }
    public static boolean isStringInteger(String number ){
        try{
            Integer.parseInt(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
}
