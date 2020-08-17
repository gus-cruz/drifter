package database.entities;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@HashCodeAndEqualsPlugin.Enhance(invokeSuper = HashCodeAndEqualsPlugin.Enhance.InvokeSuper.ALWAYS)
public class Employee extends BaseEntity {
    @Column(name = "salary", nullable = false)
    private double salary;

    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }


    @Column(name = "commission_fee")
    private double commission_fee;

    public double getCommissionFee() { return commission_fee; }

    public void setCommissionFee(double commissionFee) { this.commission_fee = commissionFee; }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role_id;

    public Role getRole_id() { return role_id; }

    public void setRole_id(Role role_id) { this.role_id = role_id; }


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person_id;

    public Person getPersonId() { return person_id; }

    public void setPersonId(Person personId) { this.person_id = personId; }
}
