package com.ucc.ova.OVAContaduriaApi.model;

import javax.persistence.*;

@Entity
@Table(name = "data")
public class DataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id_data;

    @Column(name = "id_usuario")
    public int idUsuario;

    @Column(name = "json_caratula")
    public String jsonCaratula;

    @Column(name = "json_patrimonio")
    public String jsonPatrimonio;

    @Column(name = "json_renta_liquida")
    public String jsonRentaLiquida;

}
