package oit.is.ouyouteam.c05.l_app.l_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import oit.is.ouyouteam.c05.l_app.l_app.model.FruitMapper;

@Controller
@RequestMapping("/sample5")
public class Sample51Controller {

  @Autowired
  FruitMapper fruitMapper;

  @GetMapping("step1")
  public String sample21(ModelMap model) {
    model.addAttribute("fruits", fruitMapper.selectAllFruit());
    return "sample51.html";
  }


}
