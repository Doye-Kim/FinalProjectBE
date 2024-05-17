package com.ssafy.finalpjt.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    private int userSeq;
    private String userNickname;
    private String password;
    private String userPhone;
    private String role;
    private String userId;
    private int allowSearchByPhone;
    private int isQuit;
}
