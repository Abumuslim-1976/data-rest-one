package uz.pdp.datarestone.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestone.entity.User;
import uz.pdp.datarestone.entity.Warehouse;

import java.util.List;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFirstName();

    String getLastName();

    String getCode();

    boolean getActive();

    String getPhoneNumber();

    List<Warehouse> getWarehouses();

}
