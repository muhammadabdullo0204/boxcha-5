package boxcha.uz.boxcha.repository;

import boxcha.uz.boxcha.entity.Uxlash;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UxlashRepo extends JpaRepository <Uxlash, Long> {
    Page<Uxlash> findAllByVaqtContainsIgnoreCaseOrDavomiyligiContainsIgnoreCaseOrJamiOquvchiSoniContainsIgnoreCaseOrUxlaganOquvchiSoniContainsIgnoreCaseOrUxlamaganOquvchiSoniOrId(int key , int davomiyligi , int jamiOquvchiSoni, int uxlaganOquvchiSoni, int uxlamaganOquvchiSoni ,Long id , Pageable pageable);

}
