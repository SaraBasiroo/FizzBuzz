import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<fizzBuzz> fizzbuzzList = new ArrayList<>();
        fizzbuzzList.add(new fizzBuzz(3, "Fizz"));
        fizzbuzzList.add(new fizzBuzz(5, "Buzz"));

        int start = 1;
        int end = 100;

        for (int i = start; i < end; i++) {
            String result = "";
            for (fizzBuzz fb : fizzbuzzList) {
                if (i % fb.getDivisor() == 0) {
                    result += fb.getOutput();
                }
            }
            System.out.println(result.isEmpty() ? i : result);
        }
    }
}

class fizzBuzz {
    private int divisor;
    private String output;

    public fizzBuzz(int divisor, String output) {
        this.divisor = divisor;
        this.output = output;
    }

    public int getDivisor() {
        return divisor;
    }

    public String getOutput() {
        return output;
    }
}