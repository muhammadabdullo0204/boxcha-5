package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.Uxlash;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UxlashService extends GeneralService<Uxlash, Number>{
    Page<Uxlash> findAllByVaqtContainsIgnoreCaseOrDavomiyligiContainsIgnoreCaseOrJamiOquvchiSoniContainsIgnoreCaseOrUxlaganOquvchiSoniContainsIgnoreCaseOrUxlamaganOquvchiSoniOrId(int key , int davomiyligi , int jamiOquvchiSoni, int uxlaganOquvchiSoni, int uxlamaganOquvchiSoni ,  Pageable pageable);

}
