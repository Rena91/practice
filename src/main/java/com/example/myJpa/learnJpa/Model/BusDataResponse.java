package com.example.myJpa.learnJpa.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@Getter
@Setter
@Builder

public class BusDataResponse {

    private ErrorMessage errorMessage;
    private HttpStatus httpStatus;
    private String Status;

}
