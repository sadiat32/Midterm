package design;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingEmployeeInfo {
        //Write Unit Test for all the methods has been implemented in this package.
        @Test
        public void calculateEmloyeeBonus(){
            int Expected_resault = 2500;
            int current=EmployeeInfo.calculateEmployeeBonus(2,120000);
            Assert.assertEquals(Expected_resault,current);
            System.out.println("passed");

        }
        @Test
        public void calculateEmloyeeBonus1(){
            int Expected_resault = 9600;
            int current=EmployeeInfo.calculateEmployeeBonus(2,120000);
            Assert.assertEquals(Expected_resault,current);
            System.out.println("passed");

        }
}
