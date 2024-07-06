package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.Ovqatlanish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OvqatlanishService extends GeneralService <Ovqatlanish , Number>{

    Page<Ovqatlanish> findAllByOvqatContainsIgnoreCaseOrDavomiyligiContainsIgnoreCaseOrSoatContainsIgnoreCaseOrId(String key , int davomiyligi , int soat, Pageable pageable);

}
