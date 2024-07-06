package boxcha.uz.boxcha.controller;

import boxcha.uz.boxcha.entity.Director;
import boxcha.uz.boxcha.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/director")
@CrossOrigin(origins = "*", maxAge = 3600)
public class DirectorController {

    @Autowired
    DirectorService directorService;

    @GetMapping
    public Page<Director> getAll(@RequestParam(required = false) String ism, String familya, String sharif, String yosh, String maosh, String jins, Pageable pageable) {
        if (ism == null) ism = "";
        return directorService.findAllByIsmContainsIgnoreCaseOrFamilyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrYoshContainsIgnoreCaseOrMaoshContainsIgnoreCaseOrJinsContainsIgnoreCase(ism, familya, sharif, yosh, maosh, jins, pageable);
    }

    @PostMapping
    public Director create(@RequestBody Director director) {
        return directorService.create(director);
    }

    @PutMapping
    public Director update(@RequestBody Director director) {
        return directorService.update(director);
    }

    @DeleteMapping
    public void delete(@RequestBody Director director) {
        directorService.delete(director);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        directorService.deletebyId(id);
    }
}
