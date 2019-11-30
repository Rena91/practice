package com.example.myJpa.learnJpa.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "BUSES")
public class Buses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BUSID")
    private Long busId;

    @Column(name="BUSNAME")
    private String busName;

    @Column(name="BUSNUMBER")
    private String busNO;

    @Column(name="BUSTYPE")
    private String busClass;

    @Column(name="BUSCLASS")
    private String busJoin;

    @Column(name="BUSSERVICESTARTED")
    private LocalDateTime busServiceStarted;

    @Column(name="DEPOTID")
    private Long DepotId;

}
