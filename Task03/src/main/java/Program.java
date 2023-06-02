public class Program {
    public void run() {
        int[] firstArray = new int[] {-2, 3, 0, 5, 10, 15};
        int[] secondArray = new int[] {2, 4, -5, 3, -2};
        printArray(firstArray, "Первый массив: ");
        printArray(secondArray, "Второй массив: ");
        int[] difArray = getDifArrays(firstArray, secondArray);
        printArray(difArray, "Результирующий массив: ");
    }
    private int[] getDifArrays(int[] firstArr, int[] secondArr) {
        if (firstArr.length != secondArr.length) throw new RuntimeException("Размерность массивов не одинаковая");
        else {
            int[] difArr = new int[firstArr.length];
            for (int i = 0; i < firstArr.length; i++) {
                difArr[i] = firstArr[i] - secondArr[i];
            }
            return difArr;
        }
    }
    private void printArray(int[] arr, String msg) {
        System.out.print(msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
