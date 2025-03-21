package com.example.BE_number_blind_date.post.Dto;

import com.example.BE_number_blind_date.post.Entity.HobbyCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DtoCreatePost {

    private String nickname;
    private String contact;
    private String mbti;
    private int height;
    private String highlight;
    private List<HobbyCategory> hobbies;
}
