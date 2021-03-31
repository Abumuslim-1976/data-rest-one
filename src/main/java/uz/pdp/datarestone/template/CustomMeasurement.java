package uz.pdp.datarestone.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestone.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Integer getId();

    String getName();

    boolean getActive();

}
