package com.hello.foreverpet.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.Date;

@Entity
@Table(name = "user_info")
@Getter
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "user_no")
    Long userNo;

    @NotNull
    @Column(name = "user_email")
    String userEmail;

    @NotNull
    @Column(name = "user_pw")
    String userPw;

    @NotNull
    @Column(name = "user_phone")
    String userPhone;

    @NotNull
    @Column(name = "user_address")
    String userAddress;

    @NotNull
    @Column(name = "user_zipcode")
    String userZipcode;

    @Column(name = "user_social_type")
    String userSocialType;

    @Column(name = "user_access_token")
    String userAccessToken;

    @NotNull
    @Column(name = "user_joindate")
    Date userJoindate;

    @NotNull
    @Column(name = "user_modifydate")
    Date userModifydate;

    @NotNull
    @Column(name = "user_delete_yn")
    Boolean userDeleteYn;

    @NotNull
    @Column(name = "user_point")
    Integer userPoint;

    @NotNull
    @Column(name = "user_profile_image")
    String userProfileImage;
}
