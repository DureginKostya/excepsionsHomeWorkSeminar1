/* Задание №2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public static int sum2d(String[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < 5; j++) {
            int val = Integer.parseInt(arr[i][j]);
            sum += val;
        }
    }
    return sum;
} */

public class Main {
    public static void main(String[] args) {
        String[][] myArray = new String[][] {{"ab", "cd", "fg"},
                                             {"hj", "kl", "mn"},
                                             {"op", "rs", "tu"}};
        System.out.println(sum2d(myArray));
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

//            for (int j = 0; j < 5; j++) {                    ArrayIndexOutOfBoundsException

            for (int j = 0; j < arr.length; j++) {

                int val = Integer.parseInt(arr[i][j]);      // NumberFormatException (если в кавычках записать целые числа, исключения не будет)
                sum += val;
            }
        }
        return sum;
    }
}
