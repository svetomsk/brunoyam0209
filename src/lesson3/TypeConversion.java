public class TypeConversion {
    public static void main(String[] args) {
        byte a = 13;
        int b = 1024;
        b = a;

        b = 1231232;
//        a = b;
        a = (byte) b;
        System.out.println(a);

        int first = 1;
        int second = 2;
        double average =  ((double) first + second) / 2;
        System.out.println(average);

        String strNum = "1234";
        int num = Integer.valueOf(strNum);
        System.out.println(num);

        String str = Integer.toString(num);
        System.out.println(str.charAt(str.length() - 2));

        double value = Double.valueOf("23.2");
        System.out.println(value);
    }
}
