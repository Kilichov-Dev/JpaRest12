package uz.pdp.task_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_1.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    String getName();

    boolean getActive();
}
