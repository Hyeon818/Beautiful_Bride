package com.memory.beautifulbride.entitys.member;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Controller;

import java.sql.Date;

@Entity
@Table(name = "TBL_IMAGE")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ProfileImage {
    @Id
    @Column(name = "IMAGE_INDEX")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected final int index = 0;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MEM_NO")
    private Member member;

    @Column(name = "MEM_PHOTO_PATH")
    private String memPhotoPath;

    @Column(name = "UPLOAD_DATE")
    @LastModifiedDate
    protected Date uploadDate;
}
