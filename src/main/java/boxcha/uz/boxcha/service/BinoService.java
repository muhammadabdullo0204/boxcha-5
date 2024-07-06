package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.Bino;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BinoService extends GeneralService<Bino, Number>{
    Page<Bino> findAllByNomContainsIgnoreCaseOrJoylashuvContainsIgnoreCaseOrMaydoniContainsIgnoreCaseOrNechiQavatContainsIgnoreCaseOrId(
            String key, String joylashuv, String maydoni, String nechiQavat,  Pageable pageable);

}
