package database.entities;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@HashCodeAndEqualsPlugin.Enhance(invokeSuper = HashCodeAndEqualsPlugin.Enhance.InvokeSuper.ALWAYS)
public class Customer extends BaseEntity {
    public Customer() {}

    public Customer(String profession, double income, String license, Date license_expiration_date, Person person_id) {
        this.profession = profession;
        this.income = income;
        this.license = license;
        this.license_expiration_date = license_expiration_date;
        this.person_id = person_id;
    }

    @Column(name = "profession", length = 50)
    private String profession;

    public String getProfession() { return profession; }

    public void setProfession(String profession) { this.profession = profession; }


    @Column(name = "income", nullable = false)
    private double income;

    public double getIncome() { return income; }

    public void setIncome(double income) { this.income = income; }


    @Column(name = "license", length = 11, nullable = false)
    private String license;

    public String getLicense() { return license; }

    public void setLicense(String license) { this.license = license; }


    @Temporal(TemporalType.DATE)
    @Column(name = "license_expiration_date", nullable = false)
    private Date license_expiration_date;

    public Date getLicenseExpirationDate() { return license_expiration_date; }

    public void setLicenseExpirationDate(Date licenseExpirationDate) {
        this.license_expiration_date = licenseExpirationDate;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person_id;

    public Person getPersonId() { return person_id; }

    public void setPersonId(Person personId) { this.person_id = personId; }
}
