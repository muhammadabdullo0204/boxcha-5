package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.Director;
import boxcha.uz.boxcha.repository.DirectorRepo;
import boxcha.uz.boxcha.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DirectorServiceImp implements DirectorService {

    @Autowired
    DirectorRepo directorRepo;
    @Override
    public Page<Director> findAllByIsmContainsIgnoreCaseOrFamilyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrYoshContainsIgnoreCaseOrMaoshContainsIgnoreCaseOrJinsContainsIgnoreCase(String ism, String familya, String sharif, String yosh, String maosh, String jins, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Director> getAll(Pageable pageable) {
        return directorRepo.findAll(pageable);
    }

    @Override
    public Director create(Director data) {
        return directorRepo.save(data);
    }

    @Override
    public Director update(Director data) {
        return directorRepo.save(data);
    }

    @Override
    public void delete(Director data) {

        directorRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {

        directorRepo.deleteById(id);
    }
}
