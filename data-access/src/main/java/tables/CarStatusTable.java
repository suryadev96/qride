package tables;

import car.Car;
import car.CarStatus;
import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import location.GeoLocation;

// Details of CarStatusTable.
@Entity
public class CarStatusTable implements Serializable {
  @Id private String carId;

  @Enumerated(EnumType.ORDINAL)
  private Car.CarType carType;

  @Enumerated(EnumType.ORDINAL)
  private CarStatus.CarAvailability carAvailability;

  @Embedded private GeoLocation geoLocation;

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public Car.CarType getCarType() {
    return carType;
  }

  public void setCarType(Car.CarType carType) {
    this.carType = carType;
  }

  public CarStatus.CarAvailability getCarAvailability() {
    return carAvailability;
  }

  public void setCarAvailability(CarStatus.CarAvailability carAvailability) {
    this.carAvailability = carAvailability;
  }

  public GeoLocation getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }
}