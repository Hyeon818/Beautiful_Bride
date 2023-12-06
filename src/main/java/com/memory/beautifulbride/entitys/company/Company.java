package com.memory.beautifulbride.entitys.company;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBL_COMPANY")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Company {
    @Id
    @Column(name = "COMPANY_NO")
    protected final int companyNo = 0;

    @Convert(converter = CompanyKinds.Convert.class)
    @Column(name = "MEM_KINDS")
    @Builder.Default
    private CompanyKinds memKinds = CompanyKinds.COMPANY;

    @Column(name = "COMPANY_NAME")
    private String companyName;
}
