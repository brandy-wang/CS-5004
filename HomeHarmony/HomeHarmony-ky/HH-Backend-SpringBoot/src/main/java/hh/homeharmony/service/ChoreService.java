package hh.homeharmony.service;

import hh.homeharmony.pojo.Chore;
import java.util.List;

public interface ChoreService {

  List<Chore> list();

  void delete(Integer id);
}
