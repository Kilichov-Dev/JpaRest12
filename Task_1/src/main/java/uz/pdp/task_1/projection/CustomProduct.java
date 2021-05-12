package uz.pdp.task_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_1.entity.Attachments;
import uz.pdp.task_1.entity.Category;
import uz.pdp.task_1.entity.Measurement;
import uz.pdp.task_1.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Category getCategory();

    String getCode();

    Measurement getMeasurement();

}
