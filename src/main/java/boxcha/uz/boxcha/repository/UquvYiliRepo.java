package boxcha.uz.boxcha.repository;

import boxcha.uz.boxcha.entity.UquvYili;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface UquvYiliRepo extends JpaRepository <UquvYili , Long> {

    Page<UquvYili> findAllByBoshlanganVaqtContainsIgnoreCaseOrTugaganVaqtContainsIgnoreCaseOrJamiOquvchilarContainsIgnoreCaseOrId(LocalDate key ,LocalDate tugaganVaqt , int jamiOquvchilar, Long id , Pageable pageable);

}
