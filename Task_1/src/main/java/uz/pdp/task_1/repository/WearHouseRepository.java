package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task_1.entity.WearHouse;
import uz.pdp.task_1.projection.CustomInput;
import uz.pdp.task_1.projection.CustomWearHouse;

@RepositoryRestResource(path = "wearHouse",collectionResourceRel = "list",excerptProjection = CustomWearHouse.class)

public interface WearHouseRepository extends JpaRepository<WearHouse, Integer> {
    boolean existsByName(String name);

}
