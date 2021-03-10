/*
Name - Sean 0'Shaughnessy
Student Number - G00358883
Student Email - G00358883@gmit.ie
Semester 2 In-Class Java Test
10/03/2021 9am - 11pm
 */

//Employee class for the constructors,getter,setters

package ie.gmit.Employee;

public class Employee {

    String employeeTitle;
    String employeeName;
    String ppsID;
    int phoneNumber;
    String employmentType;
    int age;

    public Employee(String employeeTitle, String employeeName, String ppsID, int phoneNumber, String employmentType, int age){

        setEmployeeTitle(employeeTitle);
        setEmployeeName(employeeName);
        setPpsID(ppsID);
        setPhoneNumber(phoneNumber);
        setEmploymentType(employmentType);
        setAge(age);
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        if((employeeTitle.equals("Mr")) || (employeeTitle.equals("Mrs")) || (employeeTitle.equals("Miss"))){
            this.employeeTitle = employeeTitle;

        }else{
            throw new IllegalArgumentException("Invalid title entered");
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if(employeeName.length() >= 5 && employeeName.length() <= 22){
            this.employeeName = employeeName;
        }else{
            throw new IllegalArgumentException("Invalid name, Name provided is not valid");
        }
    }

    public String getPpsID() {
        return ppsID;
    }

    public void setPpsID(String ppsID) {
        if(ppsID.length() == 6){
            this.ppsID = ppsID;
        }else{
            throw new IllegalArgumentException("Invalid PPS ID Number");
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if(String.valueOf(phoneNumber).length() == 7){
            this.phoneNumber = phoneNumber;
        }else{
            throw new IllegalArgumentException("Invalid phone number entered");
        }

    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        if((employmentType.equals("Full-time")) || (employmentType.equals("Part-time"))){
            this.employmentType = employmentType;

        }else{
            throw new IllegalArgumentException("Invalid Employment Type entered");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18){
            this.age = age;
        }else{
            throw new IllegalArgumentException("Invalid Age, Age must be over 18");
        }
    }
}
