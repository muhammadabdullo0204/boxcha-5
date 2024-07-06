package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.Uqituvchi;
import boxcha.uz.boxcha.entity.Uquvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UqituvchiService extends GeneralService <Uqituvchi , Number>{

    Page<Uqituvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrJinsContainsIgnoreCase(
            String ism, String familiya, String sharif, String jins, Pageable pageable);

    Page<Uquvchi> findAll(Pageable pageable);
    Page<Uqituvchi> findAllByYoshOrMaosh(int yosh, int maosh, Pageable pageable);
}
