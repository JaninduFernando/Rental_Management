package edu.icet.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hardware")
public class HardwareItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ItemId;
    private String Name;
    private String RentalPerDay;
    private String FinePerDay;
    private  String Availability;

}
