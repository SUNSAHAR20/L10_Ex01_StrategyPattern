// Define the context class that uses the encryption strategy
public class ChatClient {
    private EncryptionStrategy encryptionStrategy;

    public ChatClient(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public void setEncryptionStrategy(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public void send(String message) {
        encryptionStrategy.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
