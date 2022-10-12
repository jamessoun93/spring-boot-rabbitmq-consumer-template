package me.seunghyunson.mq;

import lombok.Data;

import java.util.Date;

@Data
public class CustomMessage {

    private String messageId;
    private String message;
    private Date messageDate;
}
