package com.github.murilonerdx.paymentservice.model;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Payment implements Serializable {
    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;
}
