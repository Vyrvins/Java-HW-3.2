public class BmiService {
    public double calculate(double weitht, double height) {
        double result = weitht / (height * height);
        return result;
    }
}
