package com.example.myJpa.learnJpa.Controller;


import com.example.myJpa.learnJpa.Model.BusDataResponse;
import com.example.myJpa.learnJpa.Model.BusRecordRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(value = "Application API")
@RestController
public class CreateBus {

    @ApiOperation(value = "POST", notes = "Create a bus record")
    @RequestMapping(value = "/createBusRecord", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<BusDataResponse> createBusRecord(@RequestBody BusRecordRequest busRecordRequest) {

        log.debug("() => {}", busRecordRequest);
        return null;
    }

}

