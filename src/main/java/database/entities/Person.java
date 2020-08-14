package database.entities;

import database.enums.GenderENUM;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "people")
public class Person {
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


    @Column(name = "name", length = 100)
    private String name;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }


    @Temporal(TemporalType.DATE)
    @Column(name = "birthday")
    private Date birthday;

    public Date getBirthday() { return birthday; }

    public void setBirthday(Date birthday) { this.birthday = birthday; }


    @Column(name = "cpf", length = 11)
    private String cpf;

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }


    @Column(name = "rg", length = 20)
    private String rg;

    public String getRg() { return rg; }

    public void setRg(String rg) { this.rg = rg; }


    @Enumerated
    @Column(name = "gender")
    private GenderENUM gender;

    public GenderENUM getGender() { return gender; }

    public void setGender(GenderENUM gender) { this.gender = gender; }


    @Column(name = "telephone", length = 10)
    private String telephone;

    public String getTelephone() { return telephone; }

    public void setTelephone(String telephone) { this.telephone = telephone; }


    @Column(name = "cellphone", length = 11)
    private String cellphone;

    public String getCellphone() { return cellphone; }

    public void setCellphone(String cellphone) { this.cellphone = cellphone; }


    @Column(name = "email", length = 50)
    private String email;

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}
