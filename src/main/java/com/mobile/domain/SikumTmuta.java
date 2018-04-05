package com.mobile.domain;

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

@Table(name = "sikum_tmuta")
public class SikumTmuta {
    @Id
    public Long id;
    public Date date;
    @Column(
            columnDefinition = "NVARCHAR(255)"
    )
    public String farm;
    public Double gil;
    public Double hacnasa;
    private Double tmuta;
    private Double notru;
}

