package com.zrtech.springmvc.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zrtech.springmvc.model.domain.Uva;
import com.zrtech.springmvc.model.domain.Vinho;

@Repository
public class VinhoDao {

    private static List<Vinho> vinhos;

    public VinhoDao() {
        criarVinhos();
    }

    private void criarVinhos() {
        if (vinhos == null) {
            vinhos = new ArrayList<Vinho>();

            vinhos.add(new Vinho("nomeVinho1", 1991, "tipo", new Uva(1, "Uva um"), 1, 1.1));
            vinhos.add(new Vinho("nomeVinho2", 1992, "tipo", new Uva(2, "Uva dois"), 2, 2.1));
            vinhos.add(new Vinho("nomeVinho3", 1993, "tipo", new Uva(3, "Uva três"), 3, 3.1));
            vinhos.add(new Vinho("nomeVinho4", 1994, "tipo", new Uva(4, "Uva quatro"), 4, 4.1));
        }
    }

    public List<Vinho> getVinhos() {
        return vinhos;
    }

}
