package hh.homeharmony.pojo;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chore {
  private Integer id;
  private String choreName;
  private Integer points;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;

}
