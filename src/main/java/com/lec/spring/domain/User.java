package com.lec.spring.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
  private Long id;
  private String username;  // 회원 아이디

  @JsonIgnore
  private String password;  // 회원 비밀번호

  @JsonIgnore
  private String re_password; // 비밀번호 확인 입력

  private String name;  // 회원 이름
  private String email; // 회원 이메일

  @JsonIgnore
  private LocalDateTime regDate;  // 작성일

  // OAuth2 Client
  private String provider;
  private String providerId;

}
