package com.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaRunner.class, args);
    }

    @Bean
    public CommandLineRunner runVerification(BookRepository repository) {
        return (args) -> {
            System.out.println("\n==================================================");
            System.out.println("   WEEK 4: SPRING DATA JPA & HIBERNATE INITIALIZED ");
            System.out.println("==================================================");

            // Seed initial records to confirm Exercise 1 Entity Mapping
            repository.save(new Book("Effective Java", "Joshua Bloch", 950.00));
            repository.save(new Book("Clean Code", "Robert C. Martin", 1200.00));
            repository.save(new Book("Java Concurrency in Practice", "Joshua Bloch", 850.00));
            repository.save(new Book("Spring Boot in Action", "Craig Walls", 1100.00));

            System.out.println("\n-> [Exercise 1 Check]: Total books persisted = " + repository.count());

            // Run Exercise 2 Verification
            System.out.println("\n-> [Exercise 2 Check]: Finding books by 'Joshua Bloch':");
            repository.findByAuthor("Joshua Bloch").forEach(System.out::println);

            // Run Exercise 4 Verification
            System.out.println("\n-> [Exercise 4 Check]: JPQL Premium Books (> ₹1000):");
            repository.findPremiumBooks(1000.0).forEach(System.out::println);

            System.out.println("\n-> [Exercise 4 Check]: Native SQL Match ('Action'):");
            repository.searchByTitleKeyword("Action").forEach(System.out::println);

            System.out.println("\n==================================================");
            System.out.println("      ALL WEEK 4 TASKS EXECUTION COMPLETE SUCCESS  ");
            System.out.println("==================================================");
        };
    }
}