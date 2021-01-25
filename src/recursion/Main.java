package recursion;

public class Main {
    public static void Enumer(int N, int k){
        if(k == N){
            System.out.println(N);
            return;
        }
        System.out.print(k + " ");
        Enumer(N, k+1);
    }

    public static int SumOfDigits(int N){
        if(N/10 == 0){
            return N;
        }
        return SumOfDigits(N/10) + N%10;
    }

    public static String Palindrome(String Word, int i){
        if(i == Word.length() - 1){
            return "" + Word.charAt(i);
        }
        return Palindrome(Word, i + 1) + Word.charAt(i);
    }

    public static int qnt = 0;
    public static int RevNumber(int N, int i){
        qnt++;
        i++;
        if(N/10 == 0){
            return N;
        }
        return RevNumber(N/10, i) + (N%10 * (int)Math.pow(10, qnt - i));
    }

    public static void OneByOne(int N){
        if(N/10 == 0) {
            System.out.println(N);
            return;
        }
        OneByOne(N/10);
        System.out.println(N%10);
    }

    public static void main(String[] args) {
        System.out.print("№2: ");
        Enumer(6, 1);
        System.out.println("№5: " + SumOfDigits(345));
        System.out.print("№8: ");
        final String word = "tenet";
        if(Palindrome(word, 0).equals(word))
            System.out.println("YES");
        else
            System.out.println("NO");
        System.out.println("№10: " + RevNumber(123415, 0));
        System.out.println("№14: ");
        OneByOne(34567);
    }
}
