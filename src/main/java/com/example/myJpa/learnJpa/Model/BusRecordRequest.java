package com.example.myJpa.learnJpa.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Builder
public class BusRecordRequest {
    public BusRecordData busRecordData;
}
