package com.escapezone.api.domain.users;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Users {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id; // 회원 고유번호 (UUID로 변경할지 말지 고민 중)

    @Column(nullable = false)
    private String email; // 로그인 할 아이디

    private String nickName;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Grade grade;

    @Builder
    public Users(String email, String nickName, String name, String gender, Grade grade) {
        this.email = email;
        this.nickName = nickName;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

}
