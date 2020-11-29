package com.cloud.dto;

public class UserCreateDTO {
    /**
     * êÇ³Æ
     */
    private String nickname;
    /**
     * ÐÔ±ð
     */
    private Integer gender;

    public String getNickname() {
        return nickname;
    }

    public UserCreateDTO setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public UserCreateDTO setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
}
