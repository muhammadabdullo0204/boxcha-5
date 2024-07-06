package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.Xona;
import boxcha.uz.boxcha.repository.XonaRepo;
import boxcha.uz.boxcha.service.XonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class XonaServiceImpl implements XonaService {

    @Autowired
    XonaRepo xonaRepo;

    @Override
    public Page<Xona> findAllByNomContainsIgnoreCaseOrSigimiContainsIgnoreCaseOrJihozlarContainsIgnoreCaseOrId(String key, String sigimi, String jihozlar, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Xona> getAll(Pageable pageable) {
        return  xonaRepo.findAll(pageable);
    }

    @Override
    public Xona create(Xona data) {
        return xonaRepo.save(data);
    }

    @Override
    public Xona update(Xona data) {
        return xonaRepo.save(data);
    }

    @Override
    public void delete(Xona data) {

        xonaRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {

        xonaRepo.deleteById(id);
    }


}
