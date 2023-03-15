public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double metre = 1.87;
        double kg = 98;
        int bmiIndex = service.calculate(metre,kg);
        System.out.println(bmiIndex);

    }
}