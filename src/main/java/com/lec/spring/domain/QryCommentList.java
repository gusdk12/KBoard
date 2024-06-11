package com.lec.spring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false) // false : 부모 값은 같지 않게 설정
@NoArgsConstructor
public class QryCommentList extends QryResult {

  @ToString.Exclude
  @JsonProperty("data")
  List<Comment> list;
}
