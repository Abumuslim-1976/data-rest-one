package uz.pdp.datarestone.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestone.entity.Attachment;
import uz.pdp.datarestone.entity.Category;
import uz.pdp.datarestone.entity.Measurement;
import uz.pdp.datarestone.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    String getCode();

    boolean getActive();

    Category getCategory();

    Measurement getMeasurement();

    Attachment getAttachmentPhoto();

}
