package dev.mn.test.modals;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "department")
@NamedQueries({
        @NamedQuery(name = "Department.findById", query = "from Department d where d.id =: id"),
        @NamedQuery(name = "Department.findAll", query = "from Department")
})
public class Department {
    @Id
    @Column(name = "deparment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "deparment_name", length = 100, nullable = false)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(String name) {
        this.name = name;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
