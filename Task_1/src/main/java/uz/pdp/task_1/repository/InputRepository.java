package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_1.entity.Input;
import uz.pdp.task_1.projection.CustomInput;

@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
//    boolean existsByFactureNumber(String factureNumber);
    boolean existsByFactureNumberAndSupplierIdAndWearHouseId(String factureNumber, Integer supplier_id, Integer wearHouse_id);

}
