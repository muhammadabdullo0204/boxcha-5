package boxcha.uz.boxcha.repository;

import boxcha.uz.boxcha.entity.Davomat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DavomatRepo extends JpaRepository<Davomat , Long> {
    Page<Davomat> findAllByKelganlarSoniContainsIgnoreCaseOrKelmaganlarSoniContainsIgnoreCaseOrJamiOquvchilarContainsIgnoreCaseOrId(Integer key ,Integer kelmaganlarSoni ,Integer jamiOquvchilar ,  Long id , Pageable pageable);
}
