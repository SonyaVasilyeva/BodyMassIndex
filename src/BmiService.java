public class BmiService {

    public int calculate (double metre, double kg) {
        int index = (int) (kg/Math.pow(metre, 2));
        return index;

    }
}
