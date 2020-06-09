package wizut.tpsi.ogloszenia.jpa;


import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name="offer")
public class Offer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Size(max = 255, min = 5)
    @NotNull
    @Size(max = 255)
    @Column(name = "title")
    private String title;

    @Min(1900)
    @NotNull
    @Column(name = "year")
    private Integer year;

    @Min(0)
    @NotNull
    @Column(name = "mileage")
    private Integer mileage;

    @Min(0)
    @NotNull
    @Column(name = "engine_size")
    private BigDecimal engineSize;

    @Min(0)
    @NotNull
    @Column(name = "engine_power")
    private Integer enginePower;

    @Min(1)
    @Max(5)
    @NotNull
    @Column(name = "doors")
    private Integer doors;

    @Size(max = 30, min = 3)
    @NotNull
    @Size(max = 30)
    @Column(name = "colour")
    private String colour;

    @Size(max = 65535, min = 5)
    @NotNull
    @Lob
    @Column(name = "description")
    private String description;

    @Min(0)
    @NotNull
    @Column(name = "price")
    private Integer price;

    @NotNull
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    @ManyToOne
    private CarModel model;

    @NotNull
    @JoinColumn(name = "body_style_id", referencedColumnName = "id")
    @ManyToOne
    private BodyStyle bodyStyle;

    @NotNull
    @JoinColumn(name = "fuel_type_id", referencedColumnName = "id")
    @ManyToOne
    private FuelType fuelType;


    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getEngineSize() {
        return engineSize;
    }

    public BodyStyle getBodyStyle() {
        return bodyStyle;
    }

    public CarModel getModel() {
        return model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public Integer getDoors() {
        return doors;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public Integer getMileage() {
        return mileage;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBodyStyle(BodyStyle bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public void setEngineSize(BigDecimal engineSize) {
        this.engineSize = engineSize;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
