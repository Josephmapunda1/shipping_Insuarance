package com.example.IBRANATION.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Shipping_Insurance")
public class Shipping_Insurance {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    @Column(name = "Shipping_InsuranceID")
    int Shipping_InsuranceID;
    @Column(name = "Shipping_InsuranceName")
    String Shipping_InsuranceName;
    @Column(name = "Shipping_Insurance")
    String Shipping_insuranceAmount;
}
