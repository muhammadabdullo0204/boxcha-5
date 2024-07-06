package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.KirimChiqim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface KirimChiqimService extends GeneralService<KirimChiqim , Number>{
    Page<KirimChiqim> findAllByFoydaContainsIgnoreCaseOrZararContainsIgnoreCaseOrJamiMablagContainsIgnoreCaseOrId(int key , int zarar, int jamiMablag,  Pageable pageable);

    Page<KirimChiqim> findAllByFoydaOrZararOrJamiMablagOrId(Integer key, Integer zarar, Integer jamiMablag, Pageable pageable);
}
