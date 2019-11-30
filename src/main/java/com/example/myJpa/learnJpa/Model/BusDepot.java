package com.example.myJpa.learnJpa.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "BUS_DEPOT")
public class BusDepot {
        @Id
        @Column(name = "DEPOTID")
        private Long depotId;

        @Column(name="DEPOTNAME")
        private String depotName;

        @Column(name="DEPOTBUSES")
        private Integer depotBuses;

        @Column(name="BUSUPDATED")
        private LocalDateTime busUpdated;
}
