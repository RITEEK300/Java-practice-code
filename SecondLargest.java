class Output {

    public int SecondLargestElement(int arr[]) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }

        return second;
    }
}

public class SecondLargest {

    public static void main(String[] args) {

        int arr[] = {30,304,59,83,33};

        Output obj = new Output();

        int result = obj.SecondLargestElement(arr);

        System.out.println(result);
    }
}