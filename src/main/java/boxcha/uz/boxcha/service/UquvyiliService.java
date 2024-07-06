package boxcha.uz.boxcha.service;

import boxcha.uz.boxcha.entity.UquvYili;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public interface UquvyiliService extends GeneralService <UquvYili , Number>{
    Page<UquvYili> findAllByBoshlanganVaqtContainsIgnoreCaseOrTugaganVaqtContainsIgnoreCaseOrJamiOquvchilarContainsIgnoreCaseOrId(LocalDate key , LocalDate tugaganVaqt , int jamiOquvchilar,  Pageable pageable);

    Page<UquvYili> findAllByBoshlanganVaqtOrTugaganVaqtOrJamiOquvchilarOrId(LocalDate key, LocalDate tugaganVaqt, Integer jamiOquvchilar, Pageable pageable);


}
