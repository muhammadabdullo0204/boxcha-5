package boxcha.uz.boxcha.repository;


import boxcha.uz.boxcha.entity.Bino;
import boxcha.uz.boxcha.entity.Dars;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DarsRepo extends JpaRepository<Dars, Long> {

    Page<Dars> findAllByUquvchiContainsIgnoreCaseOrUqituvchiContainsIgnoreCaseOrXonaContainsIgnoreCaseOrUquvYiliContainsIgnoreCaseOrUxlashContainsIgnoreCaseOrOvqatlanishContainsIgnoreCaseOrDavomatContainsIgnoreCaseOrId(String uquvchi , String uqituvchi, int xona, String uquvYili,  String uxlash,  String ovqatlanish,  int davomat, Long id , Pageable pageable);


}
