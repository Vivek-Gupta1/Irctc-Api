package com.learn.Entity.Responce;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Tecket {

    private Integer tecketNo;
    private Double cost;
    private String status;
    private String name;
    private String from;
    private String to;
    private LocalDateTime doj;
}
