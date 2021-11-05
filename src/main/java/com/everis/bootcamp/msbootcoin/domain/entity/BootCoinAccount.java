package com.everis.bootcamp.msbootcoin.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Document("BootCoinAccount")
public class BootCoinAccount {

    @Id
    private String id;

    @NotNull
    private TypeDocument typeDocument;

    @NotEmpty
    private String nroDocument;

    @NotNull
    private int phoneNumber;

    @NotEmpty
    private String email;

    @NotNull
    private Double amountCoin;

    private LocalDateTime createAt;

    public enum TypeDocument {
        DNI,
        PASAPORTE,
        CEX
    }

}
