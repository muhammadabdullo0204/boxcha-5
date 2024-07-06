package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.Davomat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DavomatService extends GeneralService<Davomat , Number>{
    Page<Davomat> findAllByKelganlarSoniContainsIgnoreCaseOrKelmaganlarSoniContainsIgnoreCaseOrJamiOquvchilarContainsIgnoreCaseOrId(Integer key , Integer kelmaganlarSoni , Integer jamiOquvchilar ,  Pageable pageable);

}
