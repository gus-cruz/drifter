package database.entities;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@HashCodeAndEqualsPlugin.Enhance(invokeSuper = HashCodeAndEqualsPlugin.Enhance.InvokeSuper.ALWAYS)
public class Customer extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name ="incrementor", strategy = "increment")
    private int id;

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "profession", length = 50)
    private String profession;

    public String getProfession() { return profession; }

    public void setProfession(String profession) { this.profession = profession; }


    @Column(name = "income")
    private double income;

    public double getIncome() { return income; }

    public void setIncome(double income) { this.income = income; }


    @Column(name = "license", length = 11)
    private String license;

    public String getLicense() { return license; }

    public void setLicense(String license) { this.license = license; }


    @Temporal(TemporalType.DATE)
    @Column(name = "license_expiration_date")
    private Date license_expiration_date;

    public Date getLicenseExpirationDate() { return license_expiration_date; }

    public void setLicenseExpirationDate(Date licenseExpirationDate) {
        this.license_expiration_date = licenseExpirationDate;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY.EAGER)
    @JoinColumn(name = "person_id")
    private Person person_id;

    public Person getPersonId() { return person_id; }

    public void setPersonId(Person personId) { this.person_id = personId; }
}
