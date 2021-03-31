package uz.pdp.datarestone.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestone.entity.Client;
import uz.pdp.datarestone.entity.Currency;
import uz.pdp.datarestone.entity.Output;
import uz.pdp.datarestone.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getTimestamp();

    String getFactureNumber();

    String getCode();

    Warehouse getWarehouse();

    Currency getCurrency();

    Client getClient();

}
