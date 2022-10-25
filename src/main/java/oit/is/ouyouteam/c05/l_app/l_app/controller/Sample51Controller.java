package oit.is.ouyouteam.c05.l_app.l_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.ouyouteam.c05.l_app.l_app.model.FruitMapper;

@Controller
@RequestMapping("/sample5")
public class Sample51Controller {

  @Autowired
  FruitMapper fruitMapper;

  @GetMapping("step1")
  public String sample21() {
    model.addAttribute("fruits", fruitMapper.selectAllByFruit());
    return "sample51.html";
  }


}
