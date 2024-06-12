package com.example.blog.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PROFILE_INFO")
public class ProfileInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column( name = "PROFILE_ID")
    private Long profileId;
    private String bio = "";
    private String image = "";
    private boolean following;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserInfo userInfo;

}
