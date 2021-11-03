import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(suma(8));
    }
    public static BigInteger suma(int n){
        BigInteger pierwszy = new BigInteger("1");
        BigInteger drugi = new BigInteger("2");
        BigInteger sum = new BigInteger("0");
        BigInteger staly = new BigInteger("2");

        int m = n*n;

        for( int i = 0; i < m;i++){
            sum = sum.add(pierwszy);
            pierwszy = pierwszy.multiply(drugi);
        }
        return sum;
    }
}