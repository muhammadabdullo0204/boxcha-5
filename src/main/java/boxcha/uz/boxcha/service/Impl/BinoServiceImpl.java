package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.Bino;
import boxcha.uz.boxcha.repository.BinoRepo;
import boxcha.uz.boxcha.service.BinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BinoServiceImpl implements BinoService {



    @Autowired
    BinoRepo binoRepo;

    @Override
    public Page<Bino> findAllByNomContainsIgnoreCaseOrJoylashuvContainsIgnoreCaseOrMaydoniContainsIgnoreCaseOrNechiQavatContainsIgnoreCaseOrId(String key, String joylashuv, String maydoni, String nechiQavat, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Bino> getAll(Pageable pageable) {
        return binoRepo.findAll(pageable);
    }

    @Override
    public Bino create(Bino data) {
        return binoRepo.save(data);
    }

    @Override
    public Bino update(Bino data) {
        return binoRepo.save(data);
    }

    @Override
    public void delete(Bino data) {

        binoRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {

        binoRepo.deleteById(id);
    }
}
