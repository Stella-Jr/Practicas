package com.mycompany.loginweb.model;

public class Usuario {
    private int id;
    private String nombreUsuario;
    private String clave;
    private String nombreCompleto;

    public Usuario() {}

    public Usuario(String nombreUsuario, String clave, String nombreCompleto) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.nombreCompleto = nombreCompleto;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }
}