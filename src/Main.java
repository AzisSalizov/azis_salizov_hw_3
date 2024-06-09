public class Main {
    public static void main(String[] args) {
        double[] array = {3.1, 2.3, -1.4, 5.6, 6.5, -1.2, 2.4, -9.2, 1.1, -5.5, -3.9, 10.2, -1.7, -2.1, 5.4};

        boolean firstNegative = false;
        double sum = 0;
        double count = 0;

        for (double number : array) {
            if (!firstNegative) {
                if (number < 0) {
                    firstNegative = true;
                }
            } else {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            }
        }

        if (count > 0) {
            double medium = sum / count;
            System.out.println("Medium: " + medium);
        } else {
            System.out.println("No negative numbers");
        }
    }
}