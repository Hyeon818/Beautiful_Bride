package com.memory.beautifulbride.entitys.member;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "TBL_MEM_PROFILE")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Profile {
    @Id
    @Column(name = "PROFILE_INDEX")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected final int profileIndex = 0;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEM_NO")
    private Member member;

    @Column(name = "MEM_NAME")
    private String memName;

    @Column(name = "MEM_EMAIL")
    private String memEmail;

    @Column(name = "MEM_PHONE")
    private String memPhone;

    @Column(name = "MEM_WEDDINGDATE")
    private Date memWeddingDate;

    @Column(name = "MEM_PROFILE_PHOTO")
    private String memProfilePhotoPath;
}
