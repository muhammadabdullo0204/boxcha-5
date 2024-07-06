package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.KirimChiqim;
import boxcha.uz.boxcha.repository.KirimChiqimRepo;
import boxcha.uz.boxcha.service.KirimChiqimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KirimChiqimServiceImpl implements KirimChiqimService {
    @Autowired
    KirimChiqimRepo kirimChiqimRepo;

    @Override
    public Page<KirimChiqim> findAllByFoydaContainsIgnoreCaseOrZararContainsIgnoreCaseOrJamiMablagContainsIgnoreCaseOrId(int key, int zarar, int jamiMablag, Pageable pageable) {
        return null;
    }

    @Override
    public Page<KirimChiqim> findAllByFoydaOrZararOrJamiMablagOrId(Integer key, Integer zarar, Integer jamiMablag, Pageable pageable) {
        return null;
    }

    @Override
    public Page<KirimChiqim> getAll(Pageable pageable) {
        return kirimChiqimRepo.findAll(pageable);
    }

    @Override
    public KirimChiqim create(KirimChiqim data) {
        return kirimChiqimRepo.save(data);
    }

    @Override
    public KirimChiqim update(KirimChiqim data) {
        return kirimChiqimRepo.save(data);
    }

    @Override
    public void delete(KirimChiqim data) {

        kirimChiqimRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {

        kirimChiqimRepo.deleteById(id);
    }
}
