package demo;

import java.util.Date;

public class Employee {
    private String empId;
    protected String fullname;
    protected Boolean gender;
    protected Date birthday;
    protected String address;
    protected Float yearInWorks;
    protected Double salary;

    public Employee(String empId, String fullname, Boolean gender, Date birthday, String address, Float yearInWorks, Double salary) {
        this.empId = empId;
        this.fullname = fullname;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.yearInWorks = yearInWorks;
        this.salary = salary;
    }

    public Employee() {
    }


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getYearInWorks() {
        return yearInWorks;
    }

    public void setYearInWorks(Float yearInWorks) {
        this.yearInWorks = yearInWorks;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


}
