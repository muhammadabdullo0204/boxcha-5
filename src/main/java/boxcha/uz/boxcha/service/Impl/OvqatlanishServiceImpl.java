package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.Ovqatlanish;
import boxcha.uz.boxcha.repository.OvqatlanishRepo;
import boxcha.uz.boxcha.service.OvqatlanishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OvqatlanishServiceImpl implements OvqatlanishService {

    @Autowired
    OvqatlanishRepo ovqatlanishRepo;

    @Override
    public Page<Ovqatlanish> findAllByOvqatContainsIgnoreCaseOrDavomiyligiContainsIgnoreCaseOrSoatContainsIgnoreCaseOrId(String key, int davomiyligi, int soat, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Ovqatlanish> getAll(Pageable pageable) {
        return ovqatlanishRepo.findAll(pageable);
    }

    @Override
    public Ovqatlanish create(Ovqatlanish data) {
        return ovqatlanishRepo.save(data);
    }

    @Override
    public Ovqatlanish update(Ovqatlanish data) {
        return ovqatlanishRepo.save(data);
    }

    @Override
    public void delete(Ovqatlanish data) {

        ovqatlanishRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {

        ovqatlanishRepo.deleteById(id);
    }
}
