package oit.is.ouyouteam.c05.l_app.l_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.ouyouteam.c05.l_app.l_app.model.FruitMapper;
import oit.is.ouyouteam.c05.l_app.l_app.model.Fruit;
import java.util.ArrayList;

@Controller
@RequestMapping("/sample5")
public class Sample51Controller {

  @Autowired
  FruitMapper fruitMapper;

  @GetMapping("step1")
  public String sample21(ModelMap model) {
    ArrayList<Fruit> fruits = fruitMapper.selectAllFruit();
    model.addAttribute("fruits", fruits);
    return "sample51.html";
  }

  @GetMapping("step3")
  @Transactional
  public String sample53(@RequestParam Integer id, ModelMap model) {
    // 削除対象のフルーツを取得
    Fruit by_fruit = fruitMapper.selectById(id);
    model.addAttribute("by_fruit", by_fruit);

    // 削除
    fruitMapper.deleteById(id);

    // 削除後のフルーツリストを取得
    ArrayList<Fruit> fruits = fruitMapper.selectAllFruit();
    model.addAttribute("fruits", fruits);
    return "sample51.html";
  }

}
