package softuni.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import softuni.exam.models.Entity.Car;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository <Car , Long> {

    @Query("select c FROM Car c order by size(c.pictures) DESC , c.make")
    List<Car> findAllCarsOrderByPicturesCountThenByMake();
}
