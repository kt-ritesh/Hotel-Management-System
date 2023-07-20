package com.ritesh.Hotel.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Room")
public class HotelRoom {

    @Id
    private Integer roomId;
    @Column(unique = true)
    private Integer roomNo;
    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private Type roomType;
    private Double roomPrice;
    @Column(name = "status")
    private Boolean roomStatus;
}
