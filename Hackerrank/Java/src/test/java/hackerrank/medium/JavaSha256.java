package hackerrank.medium;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

public class JavaSha256 {

    @Test
    void testSha256() {
        String input = "HelloWorld";

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Convert the byte array to a hexadecimal representation
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = String.format("%02x", b);
                hexString.append(hex);
            }

            String sha256Hash = hexString.toString();
            System.out.println("SHA-256 Hash: " + sha256Hash);
            // SHA-256 Hash:
            // 872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
