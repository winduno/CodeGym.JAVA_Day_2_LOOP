import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit;
        int month;
        double interestRate;
        String input;

        System.out.println("Nhập tiền gửi đi anh zai!!");
        input = scanner.nextLine();

        if (isStringDouble(input)){
            deposit = Double.parseDouble(input);

            System.out.println("Nhập số tháng vào đi anh zai!!");
            input = scanner.nextLine();

            if (isStringInteger(input)){
                month = Integer.parseInt(input);

                System.out.println("Nhập lãi suất đi anh zai!!");
                input = scanner.nextLine();

                if (isStringDouble(input)){
                    interestRate = Double.parseDouble(input);

                    double totalInterest = 0;
                    for (int i = 0; i < month; i++){
                        totalInterest += deposit * (interestRate / 100) / 12 * month;
                    }

                    System.out.println("Tổng lãi là: " + totalInterest);
                }
                else{
                    System.out.println("Đem gửi tiền mà viết lãi suất thế này thì chết");
                }
            }
            else{
                System.out.println(input + " mà là số à?? Học lớp mấy rồi??");
            }
        }
        else {
            System.out.println("Tiền gửi phải là số, có vấn đề đọc hiểu à??");
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

    public static boolean isStringDouble(String number){
        try{
            Double.parseDouble(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }

}
