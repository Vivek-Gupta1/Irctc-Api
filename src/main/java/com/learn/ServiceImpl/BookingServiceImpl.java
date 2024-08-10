package com.learn.ServiceImpl;

import com.learn.Entity.Request.Passanger;
import com.learn.Entity.Responce.Tecket;
import com.learn.Serivce.BookingService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookingServiceImpl implements BookingService {
    Integer tecNo = 1;
    //    to store the data
    Map<Integer,Tecket> map = new HashMap<>();

    @Override
    public Tecket getTecket(Integer tecketNo) {
//        to check if id contain then return data
        if (map.containsKey(tecketNo)) {
            return map.get(tecketNo);
        }
        return null;
    }

    @Override
    public Tecket BookTecket(Passanger passanger) {
        Tecket tecket = new Tecket();
//        Copy Passenger data into the ticket object
        BeanUtils.copyProperties(passanger, tecket);
        tecket.setCost(500.00);
        tecket.setStatus("Confirm");
        tecket.setTecketNo(tecNo);
        tecket.setDoj(LocalDateTime.now());
        map.put(tecNo,tecket);
        tecNo++;
        return tecket;

    }
}
