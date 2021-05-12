package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_1.entity.OutputProduct;
import uz.pdp.task_1.projection.CustomOutput;
import uz.pdp.task_1.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {

}
