package org.example.dto;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "humans")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
}
