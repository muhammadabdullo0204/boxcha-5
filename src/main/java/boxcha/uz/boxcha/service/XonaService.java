package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.Xona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface XonaService extends GeneralService<Xona, Number> {
    Page<Xona> findAllByNomContainsIgnoreCaseOrSigimiContainsIgnoreCaseOrJihozlarContainsIgnoreCaseOrId(String key, String sigimi, String jihozlar, Pageable pageable);
}
