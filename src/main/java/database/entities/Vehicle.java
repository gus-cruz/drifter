package database.entities;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
@HashCodeAndEqualsPlugin.Enhance(invokeSuper = HashCodeAndEqualsPlugin.Enhance.InvokeSuper.ALWAYS)
public class Vehicle extends BaseEntity {
    public Vehicle() {}

    public Vehicle(String brand, String model, String color, String license_plate, String chassis, int year_fabrication, int year_model, double power, int passengers_number, String vehicle_type, double trunk_capacity, String fuel_type, int mileage, double daily_value) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.license_plate = license_plate;
        this.chassis = chassis;
        this.year_fabrication = year_fabrication;
        this.year_model = year_model;
        this.power = power;
        this.passengers_number = passengers_number;
        this.vehicle_type = vehicle_type;
        this.trunk_capacity = trunk_capacity;
        this.fuel_type = fuel_type;
        this.mileage = mileage;
        this.daily_value = daily_value;
    }

    @Column(name = "brand", length = 30, nullable = false)
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Column(name = "model", length = 50, nullable = false)
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Column(name = "color", length = 20, nullable = false)
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Column(name = "license_plate", length = 7, nullable = false)
    private String license_plate;

    public String getLicensePlate() {
        return license_plate;
    }

    public void setLicensePlate(String licensePlate) {
        this.license_plate = licensePlate;
    }


    @Column(name = "chassis", length = 17, nullable = false)
    private String chassis;

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }


    @Column(name = "year_fabrication")
    private int year_fabrication;

    public int getYearFabrication() {
        return year_fabrication;
    }

    public void setYearFabrication(int yearFabrication) {
        this.year_fabrication = yearFabrication;
    }


    @Column(name = "year_model")
    private int year_model;

    public int getYear_modelodel() {
        return year_model;
    }

    public void setYearModel(int yearModel) {
        this.year_model = yearModel;
    }


    @Column(name = "power")
    private double power;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }


    @Column(name = "passengers_number")
    private int passengers_number;

    public int getPassengersNumber() {
        return passengers_number;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengers_number = passengersNumber;
    }


    @Column(name = "vehicle_type", length = 30)
    private String vehicle_type;

    public String getVehicleType() {
        return vehicle_type;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicle_type = vehicleType;
    }


    @Column(name = "trunk_capacity")
    private double trunk_capacity;

    public double getTrunkCapacity() {
        return trunk_capacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunk_capacity = trunkCapacity;
    }


    @Column(name = "fuel_type", length = 20)
    private String fuel_type;

    public String getFuelType() {
        return fuel_type;
    }

    public void setFuelType(String fuelType) {
        this.fuel_type = fuelType;
    }


    @Column(name = "mileage")
    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


    @Column(name = "daily_value", nullable = false)
    private double daily_value;

    public double getDailyValue() {
        return daily_value;
    }

    public void setDailyValue(double dailyValue) {
        this.daily_value = dailyValue;
    }
}
