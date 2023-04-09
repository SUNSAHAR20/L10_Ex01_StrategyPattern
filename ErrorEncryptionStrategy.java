public class ErrorEncryptionStrategy implements EncryptionStrategy {
    @Override
    public void encrypt(String message) {
        throw new UnsupportedOperationException("Unsupported encryption algorithm");
    }
}
