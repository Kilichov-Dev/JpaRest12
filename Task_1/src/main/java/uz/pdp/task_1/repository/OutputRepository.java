package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_1.entity.Output;
import uz.pdp.task_1.projection.CustomOutput;

@RepositoryRestResource(path = "output",collectionResourceRel = "list",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
//    boolean existsByFactureNumber(String factureNumber);
    boolean existsByFactureNumberAndWearHouseId(String factureNumber, Integer wearHouse_id);
}
