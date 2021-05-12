package uz.pdp.task_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_1.entity.WearHouse;

@Projection(types = WearHouse.class)

public interface CustomWearHouse {

    Integer getId();

    String getName();

    boolean getActive();
}
