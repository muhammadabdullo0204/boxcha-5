package boxcha.uz.boxcha.repository;


import boxcha.uz.boxcha.entity.Ovqatlanish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OvqatlanishRepo extends JpaRepository <Ovqatlanish , Long> {

    Page<Ovqatlanish> findAllByOvqatContainsIgnoreCaseOrDavomiyligiContainsIgnoreCaseOrSoatContainsIgnoreCaseOrId(String key , int davomiyligi , int soat, Long id , Pageable pageable);

}
