package boxcha.uz.boxcha.repository;

import boxcha.uz.boxcha.entity.Uqituvchi;
import boxcha.uz.boxcha.entity.Uquvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UquvchiRepo extends JpaRepository<Uquvchi, Long> {

    Page<Uquvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrJinsContainsIgnoreCaseOrYoshContainsIgnoreCaseOrId(
            String ism, String familiya, String sharif, String jins,Long id , int yosh, Pageable pageable);



}
