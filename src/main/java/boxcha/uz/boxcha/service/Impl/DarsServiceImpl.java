package boxcha.uz.boxcha.service.Impl;


import boxcha.uz.boxcha.entity.Dars;
import boxcha.uz.boxcha.repository.DarsRepo;
import boxcha.uz.boxcha.service.DarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DarsServiceImpl implements DarsService {

    @Autowired
    DarsRepo darsRepo;


    @Override
    public Page<Dars> getAll(Pageable pageable) {
        return darsRepo.findAll(pageable);
    }

    @Override
    public Dars create(Dars data) {
        return darsRepo.save(data);
    }

    @Override
    public Dars update(Dars data) {
        return darsRepo.save(data);
    }

    @Override
    public void delete(Dars data) {

        darsRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {
        darsRepo.deleteById(id);

    }
}
