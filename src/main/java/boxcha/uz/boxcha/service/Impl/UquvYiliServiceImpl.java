package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.UquvYili;
import boxcha.uz.boxcha.repository.UquvYiliRepo;
import boxcha.uz.boxcha.service.UquvyiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UquvYiliServiceImpl implements UquvyiliService {
    @Autowired
    UquvYiliRepo uquvYiliRepo;

    @Override
    public Page<UquvYili> findAllByBoshlanganVaqtContainsIgnoreCaseOrTugaganVaqtContainsIgnoreCaseOrJamiOquvchilarContainsIgnoreCaseOrId(LocalDate key, LocalDate tugaganVaqt, int jamiOquvchilar, Pageable pageable) {
        return null;
    }

    @Override
    public Page<UquvYili> findAllByBoshlanganVaqtOrTugaganVaqtOrJamiOquvchilarOrId(LocalDate key, LocalDate tugaganVaqt, Integer jamiOquvchilar, Pageable pageable) {
        return null;
    }

    @Override
    public Page<UquvYili> getAll(Pageable pageable) {
        return uquvYiliRepo.findAll(pageable);
    }

    @Override
    public UquvYili create(UquvYili data) {
        return uquvYiliRepo.save(data);
    }

    @Override
    public UquvYili update(UquvYili data) {
        return uquvYiliRepo.save(data);

    }

    @Override
    public void delete(UquvYili data) {

        uquvYiliRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {

        uquvYiliRepo.deleteById(id);
    }
}
