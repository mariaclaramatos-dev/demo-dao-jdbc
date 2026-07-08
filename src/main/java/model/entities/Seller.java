package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Seller implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private Double baseSalary;

    private Department department;

    public Seller(String name, Integer id, String email, Department department, LocalDate birthDate, Double baseSalary) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.department = department;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "baseSalary=" + baseSalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", department=" + department +
                '}';
    }
}
