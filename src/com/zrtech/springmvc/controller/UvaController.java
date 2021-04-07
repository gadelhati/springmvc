package com.zrtech.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zrtech.springmvc.model.dao.UvaDao;

@Controller
@RequestMapping("uvas")
public class UvaController {

    @Autowired
    private UvaDao uvaDao;

    @RequestMapping(value = "/listaruva", method = RequestMethod.GET)
    public ModelAndView listarUvas(ModelMap model) {
        model.addAttribute("uvas", uvaDao.getUvas());
        return new ModelAndView("/uva/list", model);
    }
}