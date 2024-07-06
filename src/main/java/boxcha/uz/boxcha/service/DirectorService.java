package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.Director;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DirectorService extends GeneralService <Director , Number>{
    Page<Director> findAllByIsmContainsIgnoreCaseOrFamilyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrYoshContainsIgnoreCaseOrMaoshContainsIgnoreCaseOrJinsContainsIgnoreCase(
            String ism, String familya, String sharif, String yosh, String maosh, String jins, Pageable pageable);
}
