package uz.pdp.task_1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_1.entity.template.AbcEntity;
import uz.pdp.task_1.projection.CustomInput;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = CustomInput.class)

public class WearHouse extends AbcEntity {
}
