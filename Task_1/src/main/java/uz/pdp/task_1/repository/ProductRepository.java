package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_1.entity.Product;
import uz.pdp.task_1.projection.CustomInput;
import uz.pdp.task_1.projection.CustomProduct;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomProduct.class)

public interface ProductRepository extends JpaRepository<Product, Integer> {
    boolean existsByNameAndCategoryId(String name, Integer category_id);
}
