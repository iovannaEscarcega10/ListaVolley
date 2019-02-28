package com.example.listavolley;

public class Persona {
    private Integer id;
    private String Nombre;
    private String Apellido;
    private Integer Edad;


    public Persona(Integer id,String nombre, String apellido, Integer edad) {
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        id = id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
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
