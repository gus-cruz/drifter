package database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    public Role() {}

    public Role(String role, double baseSalary) {
        this.role = role;
        this.base_salary = baseSalary;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name ="incrementor", strategy = "increment")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "role", length = 30)
    private String role;

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }


    @Column(name = "base_salary")
    private double base_salary;

    public double getBaseSalary() { return base_salary; }

    public void setBaseSalary(double baseSalary) { this.base_salary = baseSalary; }
}
