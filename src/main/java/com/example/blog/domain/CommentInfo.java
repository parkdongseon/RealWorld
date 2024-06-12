package com.example.blog.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "COMMENT_INFO")
public class CommentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column( name = "COMMENT_ID")
    private Long commentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String body;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserInfo userInfo;

    @ManyToOne
    @JoinColumn(name = "ARTICLE_ID")
    private ArticleInfo articleInfo;
}
