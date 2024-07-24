import org.example.Employee;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class EmployeeTest {

    @Test
    public void testCalculateExtra(){
        Employee employee = new Employee("Esma Coban", 2000,5);
        int expectedSalary = 7500;
        double actualSalary = employee.calculateTotalPayment();
        Assert.assertEquals(actualSalary, expectedSalary, "toplam ödeme hesaplaması yanlıştır.");
    }

    @DataProvider(name = "employeeData")
    public Object[][] employeeData(){
        return new Object[][]{
                {"Esma Çoban", 2000, 35, 84200},
                {"Ali Yılmaz", 6500, 20, 130000},
                {"Ayşe Orman", 2500, 20, 5000}
        };
    }

    @Test(dataProvider = "employeeData")
    public void testCalculateExtra(String name, int dailySalary, int day, double expectedTotalPayment ){
        Employee employee = new Employee(name, dailySalary, day);
        double actualTotalPayment = employee.calculateTotalPayment();
        Assert.assertEquals(actualTotalPayment, expectedTotalPayment, "Toplam hesaplama yanlıştır.");

    }
}
