package com.carro.municipios;

import java.util.*;

public class Departamento {
private String nombre;
private List<Municipio> municipios;
private Gobernador gobernador;

public Departamento(String nombre, Gobernador gobernador) {
this.nombre = nombre;
this.municipios = new ArrayList<>();
this.gobernador = gobernador;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    public Gobernador getGobernador() {
        return gobernador;
    }

    public void setGobernador(Gobernador gobernador) {
        this.gobernador = gobernador;
    }

    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public void consultarMunicipios() {
        System.out.println("Municipios de " + nombre + ":");
        for (Municipio municipio : municipios) {
            System.out.println(municipio.getNombre() + "  Gobernador: " + gobernador.getNombre()+ "\n" );
        }
    }
    public Municipio buscarMunicipio(String nombreMunicipio) {
        for (Municipio municipio : municipios) {
            if (municipio.getNombre().equals(nombreMunicipio)) {
                return municipio;
            }
        }
        return null;
    }
    public void eliminarMunicipio(String nombreMunicipio) {
        for (Municipio municipio : municipios) {
            if (municipio.getNombre().equals(nombreMunicipio)) {
                municipios.remove(municipio);
                break;
            }
        }
    }
    public int calcularCenso() {
        int censo = 0;
        for (Municipio municipio : municipios) {
            censo += municipio.getPoblacion();
        }
        return censo;
    }
    public double calcularArea() {
        double areaTotal = 0;
        for (Municipio municipio : municipios) {
            areaTotal += municipio.getArea();
        }
        return areaTotal;
    }
    
    @Override
    public String toString() {
        return "Departamento :" + '\n' +
        "nombre : " + nombre + '\n' +
        "municipios : " + municipios + '\n' + 
        "gobernador : " + gobernador + '\n' +
        "                                 " ;
    }
}
