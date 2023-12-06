package com.memory.beautifulbride.entitys.member;

import com.memory.beautifulbride.config.AbstractEnumToString;

public enum MemberKinds {
    FREE, CHARGED;

    public static class Convert extends AbstractEnumToString<MemberKinds> {
        public Convert() {
            super(MemberKinds.class);
        }
    }
}
