package com.everis.bootcamp.msbootcoin.service.srv;

import com.everis.bootcamp.msbootcoin.domain.dto.BootCoinAccountDto;
import com.everis.bootcamp.msbootcoin.domain.entity.BootCoinAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BootCoinAccountService {

    Flux<BootCoinAccountDto> findAll();

    Mono<BootCoinAccountDto> findById(String id);

    Mono<BootCoinAccountDto> save(BootCoinAccount bootCoinAccount);

    Mono<BootCoinAccountDto> getBootCoinDto(BootCoinAccount bootCoinAccount);

    Mono<BootCoinAccount> getBootCoin(BootCoinAccountDto bootCoinAccountDto);

}
