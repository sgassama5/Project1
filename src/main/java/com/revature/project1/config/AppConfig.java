package com.revature.project1.config;

import com.revature.project1.model.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //   @Scope(value = "prototype")
    @Bean
    public Item item() {
        return new Item();
    }
/*
    @Bean
    public PasswordHashing getPasswordHashing(){
        return new PasswordHashing();
    }*/
}
