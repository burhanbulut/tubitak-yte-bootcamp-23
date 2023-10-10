package yte.intern.spring.application.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import yte.intern.spring.application.common.BaseEntity;

@Entity
@Data
@NoArgsConstructor
public class Student extends BaseEntity {

    private String name;
    private String surname;
    private String email;
    private String studentNumber;
}
