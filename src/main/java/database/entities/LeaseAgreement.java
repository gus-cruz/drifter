package database.entities;

import database.enums.StatusENUM;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lease_agreements")
@HashCodeAndEqualsPlugin.Enhance(invokeSuper = HashCodeAndEqualsPlugin.Enhance.InvokeSuper.ALWAYS)
public class LeaseAgreement extends BaseEntity {
    @Temporal(TemporalType.DATE)
    @Column(name = "departure_date", nullable = false)
    private Date departure_date;

    public Date getDepartureDate() { return departure_date; }

    public void setDepartureDate(Date departureDate) { this.departure_date = departureDate; }


    @Temporal(TemporalType.DATE)
    @Column(name = "expected_return_date")
    private Date expected_return_date;

    public Date getExpectedReturnDate() { return expected_return_date; }

    public void setExpectedReturnDate(Date expectedReturnDate) { this.expected_return_date = expectedReturnDate; }


    @Temporal(TemporalType.DATE)
    @Column(name = "return_date")
    private Date return_date = null;

    public Date getReturnDate() { return return_date; }

    public void setReturnDate(Date returnDate) { this.return_date = returnDate; }


    @Column(name = "departure_mileage", nullable = false)
    private int departure_mileage;

    public int getDepartureMileage() { return departure_mileage; }

    public void setDepartureMileage(int departureMileage) { this.departure_mileage = departureMileage; }


    @Column(name = "return_mileage")
    private int return_mileage;

    public int getReturnMileage() { return return_mileage; }

    public void setReturnMileage(int returnMileage) { this.return_mileage = returnMileage; }


    @Column(name = "price", nullable = false)
    private double price;

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }


    @Column(name = "penalty")
    private double penalty = 0.0;

    public double getPenalty() { return penalty; }

    public void setPenalty(double penalty) { this.penalty = penalty; }


    @Column(name = "status", columnDefinition = "enum('ACTIVATED', 'PENDING', 'HOLDING', 'CANCELED')", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusENUM status = StatusENUM.ACTIVATED;

    public StatusENUM getStatus() { return status; }

    public void setStatus(StatusENUM status) { this.status = status; }
}
