package boxcha.uz.boxcha.repository;

import boxcha.uz.boxcha.entity.KirimChiqim;
import boxcha.uz.boxcha.entity.Xona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KirimChiqimRepo extends JpaRepository <KirimChiqim , Long> {

    Page<KirimChiqim> findAllByFoydaContainsIgnoreCaseOrZararContainsIgnoreCaseOrJamiMablagContainsIgnoreCaseOrId(int key ,int zarar, int jamiMablag, Long id , Pageable pageable);

}
