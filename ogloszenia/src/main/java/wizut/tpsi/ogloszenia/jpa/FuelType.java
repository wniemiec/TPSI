package wizut.tpsi.ogloszenia.jpa;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name="fuel_type")
public class FuelType
{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;


    @Size(max = 30)
    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
