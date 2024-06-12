package com.example.blog.domain;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "USER_INFO")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column( name = "USER_ID")
    private Long userId;
    private String email = "";
    private String token = "";
    private String userName = "";

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<ProfileInfo> profileInfos;

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<ArticleInfo> articleInfos;

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL)
    private List<CommentInfo> commentInfos;

}
