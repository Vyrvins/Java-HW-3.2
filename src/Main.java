public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmi = service.calculate(40,2);
        System.out.println(myBmi);
    }
}