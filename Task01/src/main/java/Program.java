import java.util.ArrayList;
import java.util.List;

public class Program {
    public void run() {
        String[] myArray = new String[] {"1.5", "2.0", "3.2", "4.0", "5.0"};
        System.out.println(getSumma(myArray));
        System.out.println(getSquareElemArray(myArray));
        System.out.println(divideNumbers(10, 0));
    }
    private double getSumma(String[] arr) {
        double summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += Integer.parseInt(arr[i]);
        }
        return summa;
    }
    private List<Double> getSquareElemArray(String[] arr) {
        List<Double> squareArray = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            double elem = Double.parseDouble(arr[i]);
            squareArray.add(elem * elem);
        }
        return squareArray;
    }
    private double divideNumbers(int valueFirst, int valueSecond) {
        return valueFirst / valueSecond;
    }
}
