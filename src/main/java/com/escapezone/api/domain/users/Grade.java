package com.escapezone.api.domain.users;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Grade {

    GUEST("ROLE_GUEST", "손님"),
    BLACKLISTEE("ROLE_BLACKLISTEE", "신고 사용자"),

    USER("ROLE_USER", "일반 사용자");

    private final String key;

    private final String title;

}
