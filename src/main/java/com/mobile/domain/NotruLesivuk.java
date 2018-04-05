package com.mobile.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


@Data
@Entity
@NoArgsConstructor

@Table(name = "notru_lesivuk")
public class NotruLesivuk {
    @Id
    private Long id;
    @Column(
            columnDefinition = "NVARCHAR(255)"
    )
    private String farm;
    private Integer gil;
    private Integer hachnasa;
    private Integer tmuta;
    private Integer sivuk;
    private Integer notru;
}

