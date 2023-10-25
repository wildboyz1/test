package dev.mn.test.modals;

import dev.mn.test.enums.EmployeeStatus;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "employee")
@NamedQueries({
        @NamedQuery(name = "Employee.findById", query = "from Employee e where e.id =: id"),
        @NamedQuery(name = "Employee.findAll", query = "from Employee")
})
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "employee_name", length = 50, nullable = false)
    private String name;

    @Column(name = "employee_sex", nullable = false)
    private boolean sex;

    @Column(name = "dob", nullable = false)
    private Date date;

    @Column(name = "employee_salary", nullable = false)
    private double salary;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "employee_status", nullable = false)
    private EmployeeStatus status;

    @ManyToOne
    @JoinColumn(name = "deparment_id", nullable = false)
    private Department department;

    public Employee(String name, boolean sex, Date date, double salary) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.salary = salary;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", date=" + date +
                ", salary=" + salary +
                '}';
    }
}

