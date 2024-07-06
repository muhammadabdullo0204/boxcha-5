package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.Uquvchi;
import boxcha.uz.boxcha.repository.UquvchiRepo;
import boxcha.uz.boxcha.service.UquvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UquvchiServiceImpl implements UquvchiService {
    @Autowired
    private UquvchiRepo uquvchiRepo;


    @Override
    public Page<Uquvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrJinsContainsIgnoreCaseOrYoshContainsIgnoreCase(String ism, String familiya, String sharif, String jins, int yosh, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Uquvchi> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public Uquvchi create(Uquvchi data) {
        return null;
    }

    @Override
    public Uquvchi update(Uquvchi data) {
        return null;
    }

    @Override
    public void delete(Uquvchi data) {

    }

    @Override
    public void deletebyId(Long id) {

    }
}
