public class Demo {
    public static void main(String[] args) {
        // create a ChatClient with DES encryption strategy
        ChatClient client = new ChatClient(new DesEncryptionStrategy());
        client.send("Hello world!");

        // switch to AES encryption strategy
        client.setEncryptionStrategy(new AesEncryptionStrategy());
        client.send("Hello again!");
    }
}
