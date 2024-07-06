package boxcha.uz.boxcha.repository;


import boxcha.uz.boxcha.entity.Uqituvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UqituvchiRepo extends JpaRepository <Uqituvchi , Long> {

    Page<Uqituvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrJinsContainsIgnoreCaseOrId(
            String ism, String familiya, String sharif, String jins,Long id , Pageable pageable);

    Page<Uqituvchi> findAllByYoshOrMaoshOrId(int yosh, int maosh,Long id ,  Pageable pageable);
}
