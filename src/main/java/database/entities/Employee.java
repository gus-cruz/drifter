package database.entities;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employees")
@HashCodeAndEqualsPlugin.Enhance(invokeSuper = HashCodeAndEqualsPlugin.Enhance.InvokeSuper.ALWAYS)
public class Employee extends BaseEntity {
    public Employee() {}

    public Employee(double salary, double commission_fee, Role role_id, Person person_id) {
        this.salary = salary;
        this.commission_fee = commission_fee;
        this.role_id = role_id;
        this.person_id = person_id;
    }

    @Column(name = "salary", nullable = false)
    private double salary;

    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }


    @Column(name = "commission_fee")
    private double commission_fee;

    public double getCommissionFee() { return commission_fee; }

    public void setCommissionFee(double commissionFee) { this.commission_fee = commissionFee; }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role_id;

    public Role getRoleId() { return role_id; }

    public void setRoleId(Role roleId) { this.role_id = roleId; }


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person_id;

    public Person getPersonId() { return person_id; }

    public void setPersonId(Person personId) { this.person_id = personId; }
}
