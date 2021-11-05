package com.everis.bootcamp.msbootcoin.domain.repository;

import com.everis.bootcamp.msbootcoin.domain.entity.BootCoinAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BootCoinAccountRepository extends ReactiveMongoRepository<BootCoinAccount, String> {
}
