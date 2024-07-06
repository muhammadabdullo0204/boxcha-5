package boxcha.uz.boxcha.repository;

import boxcha.uz.boxcha.entity.Director;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepo extends JpaRepository<Director, Long> {
    Page<Director> findAllByIsmContainsIgnoreCaseOrFamilyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrYoshContainsIgnoreCaseOrMaoshContainsIgnoreCaseOrJinsContainsIgnoreCaseOrId(
            String ism, String familya, String sharif, String yosh, String maosh, String jins, Long id ,Pageable pageable);
}
