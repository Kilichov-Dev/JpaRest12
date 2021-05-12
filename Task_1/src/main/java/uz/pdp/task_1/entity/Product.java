package uz.pdp.task_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.task_1.entity.template.AbcEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbcEntity {
    @ManyToOne(optional = false)
    private Category category;
    @OneToOne
    private Attachments photo;
    private String code ;
    @ManyToOne(optional = false)
    private Measurement measurement;
}

