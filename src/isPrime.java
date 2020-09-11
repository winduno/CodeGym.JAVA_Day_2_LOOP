import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số vào xem nào anh zai!!");
        String input = scanner.nextLine();
        int checkNumber = 0;

        if (isStringInteger(input)){
            checkNumber = Integer.parseInt(input);
            boolean check = true;

            if (checkNumber < 2){
                check = false;
            }
            else{
                for (int i = 2; i <= Math.sqrt(checkNumber); i++){
                    if (checkNumber % i == 0){
                        check = false;
                        break;
                    }
                }
            }

            if (check){
                System.out.println(checkNumber + " là số nguyên tố.");
            }
            else{
                System.out.println(checkNumber + " không có nguyên tố gì ở đây hết");
            }
        }
        else {
            System.out.println("Không phải là số nên thôi không làm.");
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
