package com.learn.Serivce;


import com.learn.Entity.Request.Passanger;
import com.learn.Entity.Responce.Tecket;

public interface BookingService {

    public Tecket getTecket(Integer tecketNo );

    public Tecket BookTecket(Passanger passanger);

}
