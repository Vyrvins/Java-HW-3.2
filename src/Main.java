public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmiIndex = service.calculate(40, 2);
        System.out.println(myBmiIndex);
    }
}