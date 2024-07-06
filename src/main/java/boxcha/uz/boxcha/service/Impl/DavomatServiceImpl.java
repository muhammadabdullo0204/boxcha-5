package boxcha.uz.boxcha.service.Impl;


import boxcha.uz.boxcha.entity.Davomat;
import boxcha.uz.boxcha.repository.DarsRepo;
import boxcha.uz.boxcha.repository.DavomatRepo;
import boxcha.uz.boxcha.service.DarsService;
import boxcha.uz.boxcha.service.DavomatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DavomatServiceImpl implements DavomatService {

    @Autowired
    DavomatRepo davomatRepo;


    @Override
    public Page<Davomat> findAllByKelganlarSoniContainsIgnoreCaseOrKelmaganlarSoniContainsIgnoreCaseOrJamiOquvchilarContainsIgnoreCaseOrId(Integer key, Integer kelmaganlarSoni, Integer jamiOquvchilar, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Davomat> getAll(Pageable pageable) {
        return davomatRepo.findAll(pageable);
    }

    @Override
    public Davomat create(Davomat data) {
        return davomatRepo.save(data);
    }

    @Override
    public Davomat update(Davomat data) {
        return davomatRepo.save(data);
    }

    @Override
    public void delete(Davomat data) {

        davomatRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {

        davomatRepo.deleteById(id);
    }
}
