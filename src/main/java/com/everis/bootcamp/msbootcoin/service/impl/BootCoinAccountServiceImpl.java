package com.everis.bootcamp.msbootcoin.service.impl;

import com.everis.bootcamp.msbootcoin.domain.dto.BootCoinAccountDto;
import com.everis.bootcamp.msbootcoin.domain.entity.BootCoinAccount;
import com.everis.bootcamp.msbootcoin.domain.repository.BootCoinAccountRepository;
import com.everis.bootcamp.msbootcoin.service.srv.BootCoinAccountService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BootCoinAccountServiceImpl implements BootCoinAccountService {

    @Autowired
    private BootCoinAccountRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public Flux<BootCoinAccountDto> findAll() {
        return repository.findAll().flatMap(this::getBootCoinDto);
    }

    @Override
    public Mono<BootCoinAccountDto> findById(String id) {
        return repository.findById(id).flatMap(this::getBootCoinDto);
    }

    @Override
    public Mono<BootCoinAccountDto> save(BootCoinAccount bootCoinAccount) {
        return repository.save(bootCoinAccount).flatMap(this::getBootCoinDto);
    }

    @Override
    public Mono<BootCoinAccountDto> getBootCoinDto(BootCoinAccount bootCoinAccount) {
        return Mono.just(objectMapper.convertValue(bootCoinAccount, BootCoinAccountDto.class));
    }

    @Override
    public Mono<BootCoinAccount> getBootCoin(BootCoinAccountDto bootCoinAccountDto) {
        return Mono.just(objectMapper.convertValue(bootCoinAccountDto, BootCoinAccount.class));
    }
}
