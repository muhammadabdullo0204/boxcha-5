package boxcha.uz.boxcha.controller;


import boxcha.uz.boxcha.entity.Bino;
import boxcha.uz.boxcha.service.BinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bino")
@CrossOrigin(origins = "*" , maxAge = 3600)
public class BinoController {
    @Autowired
    BinoService binoService;

    @GetMapping
    public Page<Bino> getAll(@RequestParam(required = false) String key, String joylashuv, String maydoni, String nechiQavat, Pageable pageable) {
        if (key == null) key = ""
;        return binoService.findAllByNomContainsIgnoreCaseOrJoylashuvContainsIgnoreCaseOrMaydoniContainsIgnoreCaseOrNechiQavatContainsIgnoreCaseOrId(key, joylashuv, maydoni, nechiQavat, pageable);
    }

    @PostMapping
    public Bino create(@RequestBody Bino bino) {
        return binoService.create(bino);
    }

    @PutMapping
    public Bino update(@RequestBody Bino bino) {
        return binoService.update(bino);
    }

    @DeleteMapping
    public void delete(@RequestBody Bino bino) {
        binoService.delete(bino);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(@PathVariable Long id) {
        binoService.deletebyId(id);
    }
}
