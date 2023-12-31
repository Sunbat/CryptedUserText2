import javax.crypto.Cipher;
import java.security.*;

public class Messager {
    private KeyPair keyPair;

    public Messager() {
        try {
            // Generating public and private keys
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048); // Key size
            this.keyPair = keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public byte[] encryptMessage(String message) {
        try {
            // Initializing cipher for encryption with the public key
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());

            // Encrypting the message
            return cipher.doFinal(message.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String decryptMessage(byte[] encryptedMessage) {
        try {
            // Initializing cipher for decryption with the private key
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());

            // Decrypting the message
            byte[] decryptedBytes = cipher.doFinal(encryptedMessage);
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public PublicKey getPublicKey() {
        return keyPair.getPublic();
    }

    public PrivateKey getPrivateKey() {
        return keyPair.getPrivate();
    }

}
