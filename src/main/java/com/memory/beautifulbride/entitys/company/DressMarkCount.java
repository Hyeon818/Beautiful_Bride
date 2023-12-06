package com.memory.beautifulbride.entitys.company;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBL_DRESS_MARK_COUNT")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DressMarkCount {
    @Id
    @Column(name = "DRESS_VIEW_INDEX")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected final int dressMarkIndex = 0;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DRESS_INDEX")
    private DressImage dressImage;

    @Column(name = "DRESS_MARK_COUNT")
    @Builder.Default
    private long dressMarkCount = 0;
}
