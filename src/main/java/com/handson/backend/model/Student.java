package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(nullable = false, updatable = false)
    private Date createdAt = new Date(); // cannot be null and cannot be updated!

    @NotEmpty
    @Length(max = 60) // validates 60 max
    private String fullname;


    @Min(100)
    @Max(800)
    private Integer satScore; // validates between 100-800

    @Min(30)
    @Max(110)
    private Double graduationScore; // validates between 30-110

    @Length(max = 20)
    private String phone; // validates 20 max

    @Length(max = 500)
    private String profilePicture; // validates 500 max
}
