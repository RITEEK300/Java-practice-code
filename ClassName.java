class output {

    public void reverse(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

    }
}

public class ClassName {

    public static void main(String[] args) {

        String s = "Riteek";

        output obj = new output();
        obj.reverse(s);

    }
}