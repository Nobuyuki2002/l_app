package oit.is.ouyouteam.c05.l_app.l_app.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface FruitMapper {

  @Select("SELECT * from fruit;")
  ArrayList<Fruit> selectAllFruit();

  @Select("SELECT * FROM fruit where id = #{id}")
  Fruit selectById(int id);

  @Delete("DELETE FROM fruit where id = #{id}")
  void deleteById(int id);

  @Update("UPDATE FRUIT SET NAME=#{name}, PRICE=#{price} WHERE ID = #{id}")
  void updateById(Fruit fruit);
}
