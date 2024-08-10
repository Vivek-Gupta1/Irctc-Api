package com.learn.Entity.Request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Passanger {

    private String name;
    private String from;
    private String to;
//    @JsonIgnore
    LocalDateTime doj ;
    private Integer trainNo;

}
