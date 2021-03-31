package uz.pdp.datarestone.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestone.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

    Integer getId();

    String getName();

}
