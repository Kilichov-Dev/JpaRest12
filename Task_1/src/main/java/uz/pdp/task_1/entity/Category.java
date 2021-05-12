package uz.pdp.task_1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.task_1.entity.template.AbcEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
public class Category extends AbcEntity {
    @ManyToOne
    private Category parentCategory;
}
