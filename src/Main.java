public class Main {
    public static void main(String[] args) {
        int price = 10_000;

        BonusMilesService service = new BonusMilesService();
        int priceMiles = service.calculate(price);

        System.out.println(priceMiles);

    }
}
