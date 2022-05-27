public class pali {

    static boolean isPalindrom(int number) {
        int temp = number, lastNumber, reverseNumber = 0;
        while (temp != 0) {
            System.out.println("----------------------");
            System.out.println("number =" + temp);
            lastNumber = temp % 10;
            System.out.println("son basamak = " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("yeni sayi = " + reverseNumber);
            //sondaki basamağı siliyoruz.
            System.out.println("yeni temp = " + temp);
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }
}
