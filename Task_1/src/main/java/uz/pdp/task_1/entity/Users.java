package uz.pdp.task_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(unique = true, nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String code ;

    @Column(nullable = false)
    private String password;
    private boolean active = true;

    @ManyToMany
    private Set<WearHouse> wearHouseSet;

}
