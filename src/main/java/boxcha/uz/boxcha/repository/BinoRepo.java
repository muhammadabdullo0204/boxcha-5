package boxcha.uz.boxcha.repository;

import boxcha.uz.boxcha.entity.Bino;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinoRepo extends JpaRepository<Bino, Long> {
    Page<Bino> findAllByNomContainsIgnoreCaseOrJoylashuvContainsIgnoreCaseOrMaydoniContainsIgnoreCaseOrNechiQavatContainsIgnoreCaseOrId(
            String key, String joylashuv, String maydoni, String nechiQavat, Long id, Pageable pageable);
}
