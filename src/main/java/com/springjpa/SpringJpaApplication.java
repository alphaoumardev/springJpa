package com.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo repo)
    {
        return args->
        {
            Student me =new Student("Oumou","Kadiatou","oumargamil.com",22);
            repo.save(me);
        };
    }
}
