package br.edu.utfpr;

import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {
    List<Passeio> listaPasseio;
    List<Carga> listaCarga;

    public BDVeiculos() {
        this.listaPasseio = new ArrayList<>();
        this.listaCarga = new ArrayList<>();
    }

    public List<Passeio> getListaPasseio() {
        return listaPasseio;
    }

    public void setListaPasseio(List<Passeio> listaPasseio) {
        this.listaPasseio = listaPasseio;
    }

    public List<Carga> getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(List<Carga> listaCarga) {
        this.listaCarga = listaCarga;
    }
}
