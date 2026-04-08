package com.gurjeet.springlearning.config;

import com.gurjeet.springlearning.Alien;
import com.gurjeet.springlearning.Computer;
import com.gurjeet.springlearning.Desktop;
import com.gurjeet.springlearning.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.ConstructorProperties;

@Configuration
public class SpringConfig {

    @Bean(name={"com","desktop"})
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }

    @Bean
    public Alien alien(@Qualifier("laptop") Computer computer){
        Alien alien = new Alien();
        alien.setAge(25);
        alien.setCom(computer);
        return alien;
    }
}
