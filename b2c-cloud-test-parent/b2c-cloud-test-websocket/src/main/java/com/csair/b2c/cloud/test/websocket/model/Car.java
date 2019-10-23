package com.csair.b2c.cloud.test.websocket.model;

import com.csair.b2c.cloud.test.websocket.validation.CarChecksGroup;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class Car {
    @NotBlank
    private String manufacturer;
    @NotNull
    @Size(min = 2, max = 14)
    private String licensePlate;
    @Min(2)
    private int seatCount;
    @AssertTrue
    private boolean registered;

    @AssertTrue(message = "The car has to pass the vehicle inspection first", groups = CarChecksGroup.class)
    private boolean passedVehicleInspection;

    @Valid
    @NotNull
    private Driver driver;

    @Valid
    private List<Person> passengers = new ArrayList<Person>();

    public Car() {
        super();
    }

    public Car(String manufacturer, String licensePlate, int seatCount, boolean registered,
               boolean passedVehicleInspection, Driver driver, List<Person> passengers) {
        super();
        this.manufacturer = manufacturer;
        this.licensePlate = licensePlate;
        this.seatCount = seatCount;
        this.registered = registered;
        this.passedVehicleInspection = passedVehicleInspection;
        this.driver = driver;
        this.passengers = passengers;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean isRegistered) {
        this.registered = isRegistered;
    }

    public boolean isPassedVehicleInspection() {
        return passedVehicleInspection;
    }

    public void setPassedVehicleInspection(boolean passedVehicleInspection) {
        this.passedVehicleInspection = passedVehicleInspection;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Person> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Person> passengers) {
        this.passengers = passengers;
    }

}
