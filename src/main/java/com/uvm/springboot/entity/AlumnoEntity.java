package com.uvm.springboot.entity;

public class AlumnoEntity {

    private Integer matricula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String distrito;
    private String telefono;
    private String email;

    public AlumnoEntity() {
    }

    public AlumnoEntity(Integer matricula, String nombre, String apellido, String direccion, String distrito, String telefono, String email) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.distrito = distrito;
        this.telefono = telefono;
        this.email = email;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
