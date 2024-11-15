package com.cristian.iot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "data_sensores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class DataSensores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="fecha")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date fecha;

    @Column(name="valor")
    private double valor;

    @Column(name="unidades")
    private String unidades;

    @Column(name="tipoSensor")
    private String tiposensor;




}
