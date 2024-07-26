package edu.icet.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HardwareItem {

    private Integer ItemId;
    private String Name;
    private String RentalPerDay;
    private String FinePerDay;
    private  String Availability;
}
