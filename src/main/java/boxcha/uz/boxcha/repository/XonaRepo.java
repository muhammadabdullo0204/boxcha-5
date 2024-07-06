package boxcha.uz.boxcha.repository;

import boxcha.uz.boxcha.entity.Xona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XonaRepo extends JpaRepository<Xona, Long> {
    Page<Xona> findAllByNomContainsIgnoreCaseOrSigimiContainsIgnoreCaseOrJihozlarContainsIgnoreCaseOrId(String key, String sigimi, String jihozlar, Long id, Pageable pageable);
}
