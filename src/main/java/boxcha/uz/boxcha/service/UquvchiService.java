package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.Uquvchi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public interface UquvchiService extends GeneralService <Uquvchi, Number>{

    Page<Uquvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrJinsContainsIgnoreCaseOrYoshContainsIgnoreCase(
            String ism, String familiya, String sharif, String jins, int yosh, Pageable pageable);






}
