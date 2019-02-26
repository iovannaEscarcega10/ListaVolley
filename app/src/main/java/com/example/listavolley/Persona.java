package com.example.listavolley;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Id;

    public void setId(int id){
        this.Id=Id;
    }

    public int getId(){
        return Id;
    }

    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getNombre(){
        return Nombre;

    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido(){
        return Apellido;

    }

    public void setEdad(int Edad)
    {
        this.Edad=Edad;
    }

    public int getEdad(){
        return Edad;
    }


}
