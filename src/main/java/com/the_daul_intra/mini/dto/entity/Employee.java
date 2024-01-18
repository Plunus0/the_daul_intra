package com.the_daul_intra.mini.dto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String email;

    @Column(length = 30)
    private String password;

    @Enumerated(EnumType.STRING)
    private YesNo adminStatus;

    @OneToOne(mappedBy = "employee", fetch = FetchType.LAZY)
    private EmployeeProfile employeeProfile;
}