package uz.pdp.datarestone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private boolean active = true;

    @JsonIgnore
    @OneToMany(mappedBy = "currency",cascade = CascadeType.ALL)
    private List<Input> inputs;

    @JsonIgnore
    @OneToMany(mappedBy = "currency",cascade = CascadeType.ALL)
    private List<Output> outputs;

}
