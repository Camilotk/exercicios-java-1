/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.veiculos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cazevedo
 */
public class Repositorio {
    private static Repositorio repositorio;
    private static List<Passeio> listaPasseio;
    private static List<Carga> listaCarga;
    private Carga veiculoCarga;
    private Passeio veiculoPasseio;
    
    private Repositorio () {
        this.listaCarga = new ArrayList<>();
        this.listaPasseio = new ArrayList<>();
    }
    
    public static Repositorio getRepositorio() {
        if(repositorio == null) repositorio = new Repositorio();
        
        return repositorio;
    }
    
    public void excluiTodos() {
        repositorio = new Repositorio();
    }
    
    public void excluiTodosCarga() {
        listaCarga = new ArrayList<>();
    }
    
    public void excluiTodosPasseio() {
        listaPasseio = new ArrayList<>();
    }
    
    public Veiculo inserir(Veiculo v) {
        if (pesquisar(v) == null) {
            if (v instanceof Carga) {
                listaCarga.add((Carga) v);
                return v;
            } else {
                listaPasseio.add((Passeio) v);
                return v;
            }
        }
        
        return null;
    }
    
    public static List<Carga> getVeiculosCarga() {
        return listaCarga;
    }
    
    public static List<Passeio> getVeiculosPasseio() {
        return listaPasseio;
    }
    
    public Veiculo pesquisar(Veiculo v) {
        if(v instanceof Carga) {
            for(Veiculo vCarga : listaCarga) {
                if (vCarga.getPlaca().equals(v.getPlaca())) {
                    return vCarga;
                }
            }
        } else {
            for(Veiculo vPasseio : listaPasseio) {
                if(vPasseio.getPlaca().equals(v.getPlaca())) {
                    return vPasseio;
                }
            }
        }
        
        return null;
    }
    
    public Veiculo excluir(Veiculo v) {
        v = pesquisar(v);
        
        if (v != null) {
            if (v instanceof Carga) {
                listaCarga.remove((Carga) v);
                return null;
            } else {
                listaPasseio.remove((Passeio) v);
                return null;
            }
        }
        
        return v;
    }
    
    public Veiculo alterar(Veiculo v) {
        v = pesquisar(v);
        
        if(v != null) {
           if (v instanceof Carga) {
               listaCarga.remove((Carga) v);
               listaCarga.add((Carga) v);
               return v;
           } else {
               listaPasseio.remove((Passeio) v);
               listaPasseio.add((Passeio) v);
               return v;
           }
        }
        
        return null;
    }
    
    public void imprimeTodosCarga() {
        for(Carga veiculo : listaCarga) {
            veiculo.imprimeDados();
        }
    }
    
    public void imprimeTodosPasseio() {
        for(Passeio veiculo : listaPasseio) {
            veiculo.imprimeDados();
        }
    }
    
}
