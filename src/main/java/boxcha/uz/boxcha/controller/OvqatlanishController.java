package boxcha.uz.boxcha.controller;

import boxcha.uz.boxcha.entity.Ovqatlanish;
import boxcha.uz.boxcha.service.OvqatlanishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ovqatlanish")
@CrossOrigin(origins = "*" , maxAge = 3600)
public class OvqatlanishController {

    @Autowired
    OvqatlanishService ovqatlanishService;

    @GetMapping
    public Page<Ovqatlanish> getAll(@RequestParam (required = false)String key, int davomiyligi, int soat, Pageable pageable) {
        if (key == null) key = "";
        return ovqatlanishService.findAllByOvqatContainsIgnoreCaseOrDavomiyligiContainsIgnoreCaseOrSoatContainsIgnoreCaseOrId(key, davomiyligi, soat, pageable);
    }



    @PostMapping
    public Ovqatlanish create(Ovqatlanish ovqatlanish) {
        return ovqatlanishService.create(ovqatlanish);
    }

    @PutMapping
    public Ovqatlanish update(Ovqatlanish ovqatlanish) {
        return ovqatlanishService.update(ovqatlanish);
    }

    @DeleteMapping
    public void delete(Ovqatlanish ovqatlanish) {
        ovqatlanishService.delete(ovqatlanish);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(Long id) {
        ovqatlanishService.deletebyId(id);
    }
}
