package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.task_1.entity.Measurement;
import uz.pdp.task_1.projection.CustomInput;
import uz.pdp.task_1.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "list",excerptProjection = CustomMeasurement.class)

public interface MeasurmentRepository extends JpaRepository<Measurement, Integer> {
    boolean existsByName(String name);
    boolean findByIdAndActive(Integer id, boolean active);
}
