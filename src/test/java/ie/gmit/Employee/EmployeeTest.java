/*
Name - Sean 0'Shaughnessy
Student Number - G00358883
Student Email - G00358883@gmit.ie
Semester 2 In-Class Java Test
10/03/2021 9am - 11pm
 */

//Employee Test class tests for valid/invalid entries

package ie.gmit.Employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    Employee employee, employee1, employee2;

    @BeforeEach
    public void setup() {
        employee = new Employee("Mr","George","123456",1234567,"Full-time",24);
        employee1 = new Employee("Miss","Martha","123456",1234567,"Part-time",24);
        employee2 = new Employee("Mrs","Samantha","123456",1234567,"Part-time",24);
    }

    @DisplayName("Testing title")
    @Test
    public void testTitle(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Sir","John","123456",1234567,"Full-time",24));
        assertEquals("Invalid title entered",e.getMessage());
    }

    @DisplayName("Testing name")
    @Test
    public void testName(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Joe","123456",1234567,"Full-time",24));
        assertEquals("Invalid name, Name provided is not valid",e.getMessage());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Johnfghtyufhjuytgsdgdffggdfdf","123456",1234567,"Full-time",24));
        assertEquals("Invalid name, Name provided is not valid",e.getMessage());
    }

    @DisplayName("Testing PPS ID Number")
    @Test
    public void testPpsId(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","George","12345678",1234567,"Full-time",24));
        assertEquals("Invalid PPS ID Number",e.getMessage());
    }

    @DisplayName("Testing Phone Number")
    @Test
    public void testPhoneNumber(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","George","123456",123456789,"Full-time",24));
        assertEquals("Invalid phone number entered",e.getMessage());
    }

    @DisplayName("Testing Employment Type")
    @Test
    public void testEmploymentType(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","George","123456",1234567,"time-time",24));
        assertEquals("Invalid Employment Type entered",e.getMessage());
    }

    @DisplayName("Testing Age")
    @Test
    public void testAge(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","George","123456",1234567,"Full-time",16));
        assertEquals("Invalid Age, Age must be over 18",e.getMessage());
    }

    @DisplayName("Testing Title Correct")
    @Test
    public void testTitleCorrect(){
        assertEquals("Mr",employee.getEmployeeTitle());
        assertEquals("Miss",employee1.getEmployeeTitle());
        assertEquals("Mrs",employee2.getEmployeeTitle());
    }

    @DisplayName("Testing Name Correct")
    @Test
    public void testNameCorrect(){
        assertEquals("George",employee.getEmployeeName());
    }

    @DisplayName("Testing PPS ID Correct")
    @Test
    public void testPpsidCorrect(){
        assertEquals("123456",employee.getPpsID());
    }

    @DisplayName("Testing Phone Number Correct")
    @Test
    public void testPhonenumberCorrect(){
        assertEquals(1234567,employee.getPhoneNumber());
    }

    @DisplayName("Testing Employment Type Correct")
    @Test
    public void testEmploymentTypeCorrect(){
        assertEquals("Full-time",employee.getEmploymentType());
        assertEquals("Part-time",employee1.getEmploymentType());
    }


    @DisplayName("Testing Age Correct")
    @Test
    public void testAgeCorrect(){
        assertEquals(24,employee.getAge());
    }
}
