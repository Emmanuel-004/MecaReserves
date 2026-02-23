package org.mecacorp.mecareserves.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.mecacorp.mecareserves.baseclass.BaseModel;
import org.mecacorp.mecareserves.constant.ReservationStatus;

import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Reservation extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "service_type_id")
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(nullable = false)
    private String licenseNumber;

    @Column(nullable = false)
    private LocalDateTime date;

    @Column(nullable = false)
    private ReservationStatus reservationStatus;



}
