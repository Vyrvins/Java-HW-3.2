public class BmiService {
    public double calculate (double wt, double ht){
        double result = wt/(ht*ht);
        return result;
    }
}
