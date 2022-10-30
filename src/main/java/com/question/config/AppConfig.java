package com.question.config;

import com.question.domain.Movie;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("BB")
    public Movie getMovie1(){
        return new Movie(100,"Bhool Bhulaiyaa 2",2022,2.15,"Kartik Aaryan","Kiara Advani","horror comdey");

    }
    @Bean("B2")
    public Movie getMovie2(){
        return new Movie(101,"Baaghi 2",2021,2.35,"Tiger Shroff","Disha Patani","action");

    }
    @Bean("VH")
    public Movie getMovie3(){
        return new Movie(102,"Vikram: Hitlist",2022,2.45,"Kamal Hassan","None","action");
    }
}