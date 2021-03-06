package com.mobile.domain;

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
@Table(name = "sivukim")
public class Sivukim {
    @Id
    private Long id;
    private Date date;
    @Column(
            columnDefinition = "NVARCHAR(255)"
    )
    private String farm;
    private Integer lul;
    @Column(
            columnDefinition = "NVARCHAR(255)"
    )
    private String yaad;
    private Integer kamut;
    private Integer mishkal;
    private BigDecimal memuza;
    private BigDecimal hefresh;
    private Integer gil;
}

