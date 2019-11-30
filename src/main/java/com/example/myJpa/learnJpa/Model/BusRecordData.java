package com.example.myJpa.learnJpa.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BusRecordData {

    private Integer depotd;
    private String bustype;
    private String busclass;
    private String busNumber;
    private String busName;

}
