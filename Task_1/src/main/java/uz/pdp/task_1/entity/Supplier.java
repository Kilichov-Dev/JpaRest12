package uz.pdp.task_1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.task_1.entity.template.AbcEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
public class Supplier extends AbcEntity {
    @Column(unique = true, nullable = false)
    private String phoneNumber;
}
