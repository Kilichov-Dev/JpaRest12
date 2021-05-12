package uz.pdp.task_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task_1.entity.Client;
import uz.pdp.task_1.entity.Currency;
import uz.pdp.task_1.entity.Output;
import uz.pdp.task_1.entity.WearHouse;

import java.sql.Timestamp;

@Projection(types = Output.class)

public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    WearHouse getWearHouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
