public class Main {
    public static void main(String[] args) {
        Sign sign;
        sign = new Sign("Everything on sale, please come in", 15);
        System.out.println(sign.numberOfLines());
        System.out.println(sign.getLines());
        sign = new Sign("Everything on sale, please come in", 17);
        System.out.println(sign.numberOfLines());
        sign = new Sign("Everything on sale, please come in", 40);
        System.out.println(sign.numberOfLines());
    }
}
