package com.memory.beautifulbride.entitys.company;

import com.memory.beautifulbride.config.AbstractEnumToString;

public enum CompanyKinds {
    COMPANY, ADMIN;

    public static class Convert extends AbstractEnumToString<CompanyKinds> {
        public Convert() {
            super(CompanyKinds.class);
        }
    }
}
