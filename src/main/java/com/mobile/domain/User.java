package com.mobile.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

import lombok.Data;
        import lombok.NoArgsConstructor;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.Table;
        import java.math.BigDecimal;
        import java.sql.Date;

        import com.fasterxml.jackson.annotation.JsonManagedReference;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import javax.persistence.*;
        import java.sql.Date;
        import java.util.HashSet;
        import java.util.Objects;
        import java.util.Set;


@Data
@Entity
@NoArgsConstructor
@Table(name = "userlulim")
public class User {
    @Column(nullable = false)
    @Id
    private Long id;

       @Column(
            columnDefinition = "NVARCHAR(255)"
    )
    private String username;

    @Column(
            columnDefinition = "NVARCHAR(255)"
    )
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
  }

