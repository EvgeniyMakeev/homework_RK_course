import java.util.Base64;

public class Base64code {
    public static void main(String[] args) {
        String sY = "SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==";
//        byte[] encodedBytes = Base64.getEncoder().encode("Test".getBytes());
//        System.out.println("encodedBytes " + new String(encodedBytes));
        byte[] decodedBytes = Base64.getDecoder().decode(sY);
        System.out.println(new String(decodedBytes));
    }
}
