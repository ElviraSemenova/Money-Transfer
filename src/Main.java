public class Main {
    public static void main(String[] args) {
        long currentAccount = 2_000_000_000;
        int transferAmount  = 500_000_000;
        long total = currentAccount + transferAmount;
        System.out.println(total);
    }
}