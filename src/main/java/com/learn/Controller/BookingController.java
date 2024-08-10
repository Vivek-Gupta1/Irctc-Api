package com.learn.Controller;

import com.learn.Entity.Request.Passanger;
import com.learn.Entity.Responce.Tecket;
import com.learn.ServiceImpl.BookingServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
@Tag(name="Booking")
public class BookingController {

    @Autowired
    private BookingServiceImpl serviceImpl;

    @PostMapping("/tecketbook")
    public ResponseEntity<String> bookTecketPasaanger( @RequestBody Passanger passanger){
        Tecket tecket = serviceImpl.BookTecket(passanger);
        return new ResponseEntity<>("Tecket Booked Your TrainNo is "+tecket.getTecketNo(), HttpStatus.CREATED);
    }

    @GetMapping("/getecket/{tecket}")
    public Tecket getTecketById(@PathVariable Integer tecket ){
        return serviceImpl.getTecket(tecket);
    }





}
