package jpabasic.ex1hellojpa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class MemberTest {

    @Id
    private Long id;

    @Column(name = "name")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)  // TIMESTAMP : 날짜, 시간이 모두 포함된것것
    private Date createdDate;   // JAVA8 버전의 경우 @Temporal 어노테이션 말고 그냥 LocalDateTime 클래스 사용해도 된다.

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    public MemberTest() {

    }
}
