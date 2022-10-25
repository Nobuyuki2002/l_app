package oit.is.ouyouteam.c05.l_app.l_app.model;


import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FruitMapper {

  @Select("SELECT * from fruit;")
  ArrayList<Fruit> selectAllFruit();

}
