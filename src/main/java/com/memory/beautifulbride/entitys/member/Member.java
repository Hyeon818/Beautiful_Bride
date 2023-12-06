package com.memory.beautifulbride.entitys.member;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "TBL_MEMBER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {
    @Id
    @Column(name = "MEM_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected final int memNo = 0;

    @Column(name = "MEM_ID")
    private String memId;

    @Column(name = "MEM_PWD")
    private String memPwd;

    @Convert(converter = MemberKinds.Convert.class)
    @Column(name = "MEM_KINDS")
    private MemberKinds memKinds = MemberKinds.FREE;

    @Builder(toBuilder = true)
    public static class MemberBuilder {
        private Member member;
        private Profile profile;
    }
}
