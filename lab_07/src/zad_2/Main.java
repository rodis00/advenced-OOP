package zad_2;

public class Main {
    public static void main(String[] args) {
        FakeDatabaseConnector connector = FakeDatabaseConnector.getInstance();
        connector.executeQuery("SELECT * FROM users");
        connector.closeConnection();
    }
}
