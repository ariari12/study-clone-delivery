package com.delivery.db;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@MappedSuperclass //JPA에서 @Entity 클래스는 @Entity나 @MappedSuperclass로 지정한 클래스만 상속할 수 있다.
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
