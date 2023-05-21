package com.ucc.ova.OVAContaduriaApi.model;

import javax.persistence.*;

@Entity
@Table(name = "data")
public class DataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "id_usuario")
    public int idUsuario;

    @Column(name = "json_patrimonio")
    public String jsonPatrimonio;

}
