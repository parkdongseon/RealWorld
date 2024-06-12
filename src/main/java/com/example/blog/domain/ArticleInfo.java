package com.example.blog.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "ARTICLE_INFO")
public class ArticleInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column( name = "ARTICLE_ID")
    private Long articleId;
    private String slug;
    private String title;
    private String description;
    private String body;
    private List<String> tagList;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean favorited;
    private Long favoritesCount;

    @OneToMany(mappedBy = "articleInfo", cascade = CascadeType.ALL)
    private List<CommentInfo> commentInfos;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserInfo userInfo;



}
