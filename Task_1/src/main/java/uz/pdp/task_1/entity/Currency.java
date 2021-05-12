package uz.pdp.task_1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.task_1.entity.template.AbcEntity;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
public class Currency extends AbcEntity {




}
