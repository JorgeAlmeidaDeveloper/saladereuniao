package com.digitalcrud.salareuniao.saladereuniao.exception;


import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorDateils {

    private Date timestamp;
    private String message;
    private String details;

    public ErrorDateils(Date timestamp, String message, String details) {
       super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }



}
