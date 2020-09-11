public class PrimesBelow100 {
    public static void main(String[] args) {
        System.out.println("Đây là chương trình in ra các số nguyên tố nhỏ hơn 100");
        System.out.print("2 ");
        for (int i = 3; i < 100 ; i+=2) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int num){
        boolean output = true;

        if (num < 2){
            output = false;
        }
        else{
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    output = false;
                    break;
                }
            }
        }

        return output;
    }
}
