package databases;


import org.testng.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

        Assert.assertEquals("", "");


    }
}
