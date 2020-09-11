public class First20Primes {
    public static void main(String[] args) {
        System.out.println("Đây là chương trình in ra 20 số nguyên tố đầu tiên!!");
        System.out.print("2 ");
        int count = 1, i = 3;
        while (count <= 20){
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i += 2;
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
