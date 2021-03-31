package uz.pdp.datarestone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    private boolean active = true;

    @ManyToOne(optional = false)
    private Category category;

    @ManyToOne(optional = false)
    private Measurement measurement;

    @OneToOne
    private Attachment attachmentPhoto;
}
