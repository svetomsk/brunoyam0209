public class Lesson2_1 {
    public static void main(String[] args) {
        int value = -15;
        if (value > -10 && value < 10) {
            System.out.println("Center");
        } else if(value <= -10) {
            System.out.println("Left");
        } else {
            System.out.println("Right");
        }

        if (value > -10) {
            int a = 10;
            if (value < 10) {
                System.out.println("Center");
            }
        }
        int a = 10;
    }
}
