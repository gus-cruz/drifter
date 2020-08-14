package database.entities;

import database.enums.StatusENUM;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lease_agreements")
public class LeaseAgreement {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name ="incrementor", strategy = "increment")
    private int id;

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }


    @Temporal(TemporalType.DATE)
    @Column(name = "departure_date")
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


    @Column(name = "departure_mileage")
    private int departure_mileage;

    public int getDepartureMileage() { return departure_mileage; }

    public void setDepartureMileage(int departureMileage) { this.departure_mileage = departureMileage; }


    @Column(name = "lease_price")
    private double lease_price;

    public double getLeasePrice() { return lease_price; }

    public void setLeasePrice(double leasePrice) { this.lease_price = leasePrice; }


    @Column(name = "penalty")
    private double penalty = 0.0;

    public double getPenalty() { return penalty; }

    public void setPenalty(double penalty) { this.penalty = penalty; }


    @Enumerated
    @Column(name = "status")
    private StatusENUM status = StatusENUM.ACTIVATED;

    public StatusENUM getStatus() { return status; }

    public void setStatus(StatusENUM status) { this.status = status; }
}
