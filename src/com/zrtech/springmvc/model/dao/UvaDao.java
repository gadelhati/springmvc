package com.zrtech.springmvc.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zrtech.springmvc.model.domain.Uva;

@Repository
public class UvaDao {

    private static List<Uva> uvas;

    public UvaDao() {
        criarUvas();
    }

    private void criarUvas() {
        if (uvas == null) {
            uvas = new ArrayList<Uva>();

            uvas.add(new Uva(1, "Uva um"));
            uvas.add(new Uva(2, "Uva dois"));
            uvas.add(new Uva(3, "Uva três"));
            uvas.add(new Uva(4, "Uva quatro"));
        }
    }

    public List<Uva> getUvas() {
        return uvas;
    }

}
