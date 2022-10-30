package com.question;

import com.question.config.AppConfig;
import com.question.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Movie bhool = context.getBean("BB",Movie.class);
        Movie baaghi = context.getBean("B2",Movie.class);
        Movie vikram = context.getBean("VH",Movie.class);

        System.out.println(bhool);
        System.out.println();
        System.out.println(baaghi);
        System.out.println();
        System.out.println(vikram);
    }
}