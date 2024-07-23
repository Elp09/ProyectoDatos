package com.mycompany.main;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String nickname;
    private String password;
    private boolean estado;

    //Contructor
    public Usuario() {   
        estado = true;
    }

    public Usuario(String nombre, String apellidos, String nickname, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nickname = nickname;
        this.password = password;
        estado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    //Getters and setters
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
