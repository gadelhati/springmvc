package com.zrtech.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zrtech.springmvc.model.dao.VinhoDao;

@Controller
@RequestMapping("vinhos")
public class VinhoController {

    @Autowired
    private VinhoDao vinhoDao;
    
    @RequestMapping(value = "/listarvinho", method = RequestMethod.GET)
    public ModelAndView listarVinhos(ModelMap model) {
        model.addAttribute("vinhos", vinhoDao.getVinhos());
        return new ModelAndView("/vinho/list", model);
    }
}
