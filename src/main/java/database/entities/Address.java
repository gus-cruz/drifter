package database.entities;

import database.enums.AddressTypeENUM;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import javax.persistence.*;

@Entity
@Table(name = "adresses")
@HashCodeAndEqualsPlugin.Enhance(invokeSuper = HashCodeAndEqualsPlugin.Enhance.InvokeSuper.ALWAYS)
public class Address extends BaseEntity {
    public Address() {}

    @Column(name = "address_type", columnDefinition = "enum('RESIDENTIAL', 'COMEMERCIAL')", nullable = false)
    @Enumerated(EnumType.STRING)
    private AddressTypeENUM address_type = AddressTypeENUM.RESIDENTIAL;

    public AddressTypeENUM getAddressType() { return address_type; }

    public void setAddressType(AddressTypeENUM addressType) { this.address_type = addressType; }


    @Column(name = "street", length = 100, nullable = false)
    private String street;

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }


    @Column(name = "number")
    private int number;

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }


    @Column(name = "complement", length = 20)
    private String complement;

    public String getComplement() { return complement; }

    public void setComplement(String complement) { this.complement = complement; }


    @Column(name = "zip_code", length = 8, nullable = false)
    private String zip_code;

    public String getZipCode() { return zip_code; }

    public void setZip_code(String zipCode) { this.zip_code = zipCode; }


    @Column(name = "city", length =  30, nullable = false)
    private String city;

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }


    @Column(name = "state", length = 2, nullable = false)
    private String state;

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }
}