package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_1.entity.Supplier;
import uz.pdp.task_1.projection.CustomInput;
import uz.pdp.task_1.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = CustomSupplier.class)

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);

}
