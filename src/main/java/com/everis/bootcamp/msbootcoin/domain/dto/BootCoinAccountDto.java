package com.everis.bootcamp.msbootcoin.domain.dto;

import com.everis.bootcamp.msbootcoin.domain.entity.BootCoinAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BootCoinAccountDto {

    private String id;

    private TypeDocument typeDocument;

    private String nroDocument;

    private int phoneNumber;

    private String email;

    private Double amountCoin;

    private LocalDateTime createAt;

    public enum TypeDocument {
        DNI,
        PASAPORTE,
        CEX
    }

}
