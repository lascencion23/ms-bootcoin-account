package com.everis.bootcamp.msbootcoin.router;

import com.everis.bootcamp.msbootcoin.handler.BootCoinAccountHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterFunctionConfig {

    @Bean
    public RouterFunction<ServerResponse> routes (BootCoinAccountHandler handler) {
        return route(GET("/bootCoinAccount"), handler::findAll)
                .andRoute(GET("/bootCoinAccount/{id}"), handler::findId)
                .andRoute(POST("/bootCoinAccount"),handler::create);
    }
}
