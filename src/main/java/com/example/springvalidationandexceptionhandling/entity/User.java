package com.example.springvalidationandexceptionhandling.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
@Entity
@Table(name  = "usertable")
public class User {


      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer id ;
      private String name ;
      private String address;
      private String email;
      private int age ;
      private double salary ;
}
