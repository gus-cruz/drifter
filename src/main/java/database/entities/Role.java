package database.entities;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@HashCodeAndEqualsPlugin.Enhance(invokeSuper = HashCodeAndEqualsPlugin.Enhance.InvokeSuper.ALWAYS)
public class Role extends BaseEntity {
    public Role() {}

    public Role(String role, double baseSalary) {
        this.role = role;
        this.base_salary = baseSalary;
    }


    @Column(name = "role", length = 30, nullable = false)
    private String role;

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }


    @Column(name = "base_salary")
    private double base_salary;

    public double getBaseSalary() { return base_salary; }

    public void setBaseSalary(double baseSalary) { this.base_salary = baseSalary; }
}
