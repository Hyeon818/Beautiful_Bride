package com.memory.beautifulbride.entitys.company;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "TBL_DRESS_IMAGE")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DressImage {
    @Id
    @Column(name = "DRESS_INDEX")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected final int index = 0;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COMPANY_NO")
    private Company company;

    @Column(name = "DRESS_PHOTO_PATH")
    private String dressPhotoPath;

    @Column(name = "DRESS_NAME")
    private String dressName;

    @Column(name = "DRESS_PRICE")
    private int dressPrice;

    @Column(name = "UPLOAD_DATE")
    @LastModifiedDate
    private Date uploadDate;
}
