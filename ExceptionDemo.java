public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int arr[] = { 1, 23, 5, };
            System.out.println(arr[9]);
        } catch (Exception e) {

            System.out.println("ArrayIndexOutOfBoundsException aaya hai program me");
        }

    }
}