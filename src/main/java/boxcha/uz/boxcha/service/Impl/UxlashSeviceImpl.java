package boxcha.uz.boxcha.service.Impl;

import boxcha.uz.boxcha.entity.Uxlash;
import boxcha.uz.boxcha.repository.UxlashRepo;
import boxcha.uz.boxcha.service.UxlashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UxlashSeviceImpl implements UxlashService {
    @Autowired
    UxlashRepo uxlashRepo;

    @Override
    public Page<Uxlash> findAllByVaqtContainsIgnoreCaseOrDavomiyligiContainsIgnoreCaseOrJamiOquvchiSoniContainsIgnoreCaseOrUxlaganOquvchiSoniContainsIgnoreCaseOrUxlamaganOquvchiSoniOrId(int key, int davomiyligi, int jamiOquvchiSoni, int uxlaganOquvchiSoni, int uxlamaganOquvchiSoni, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Uxlash> getAll(Pageable pageable) {
        return uxlashRepo.findAll(pageable);
    }

    @Override
    public Uxlash create(Uxlash data) {
        return uxlashRepo.save(data);
    }

    @Override
    public Uxlash update(Uxlash data) {
        return uxlashRepo.save(data);
    }

    @Override
    public void delete(Uxlash data) {

        uxlashRepo.delete(data);
    }

    @Override
    public void deletebyId(Long id) {

        uxlashRepo.deleteById(id);
    }
}
