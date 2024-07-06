package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.Uqituvchi;
import boxcha.uz.boxcha.entity.Uquvchi;
import boxcha.uz.boxcha.repository.UqituvchiRepo;
import boxcha.uz.boxcha.service.UqituvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UqituvchiServiceImpl implements UqituvchiService {

    @Autowired
    private UqituvchiRepo uqituvchiRepo;


    @Override
    public Page<Uqituvchi> findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrJinsContainsIgnoreCase(String ism, String familiya, String sharif, String jins, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Uquvchi> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Uqituvchi> findAllByYoshOrMaosh(int yosh, int maosh, Pageable pageable) {
        return uqituvchiRepo.findAll(pageable);
    }

    @Override
    public Page<Uqituvchi> getAll(Pageable pageable) {
        return uqituvchiRepo.findAll(pageable);
    }

    @Override
    public Uqituvchi create(Uqituvchi data) {
        return uqituvchiRepo.save(data);
    }

    @Override
    public Uqituvchi update(Uqituvchi data) {
        return uqituvchiRepo.save(data);
    }

    @Override
    public void delete(Uqituvchi data) {

        uqituvchiRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {

        uqituvchiRepo.deleteById(id);
    }
}
