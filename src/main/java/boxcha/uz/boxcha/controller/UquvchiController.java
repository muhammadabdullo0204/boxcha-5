package boxcha.uz.boxcha.controller;

import boxcha.uz.boxcha.entity.UquvYili;
import boxcha.uz.boxcha.entity.Uquvchi;
import boxcha.uz.boxcha.service.UquvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/uquvchi")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UquvchiController {

    @Autowired
    UquvchiService uquvchiService;

    @GetMapping
    public Page<Uquvchi> getAll(@RequestParam(required = false) String ism,
                                @RequestParam(required = false) String familiya,
                                @RequestParam(required = false) String sharif,
                                @RequestParam(required = false) String jins,
                                @RequestParam(required = false) Integer yosh,
                                Pageable pageable) {
        if (ism == null) ism = "";
        if (familiya == null) familiya = "";
        if (sharif == null) sharif = "";
        if (jins == null) jins = "";
        if (yosh == null) yosh = 0;

        return uquvchiService.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrJinsContainsIgnoreCaseOrYoshContainsIgnoreCase(ism, familiya, sharif, jins, yosh, pageable);
    }





    @PostMapping
    public Uquvchi create(@RequestBody Uquvchi uquvchi) {
        return uquvchiService.create(uquvchi);
    }

    @PutMapping
    public Uquvchi update(@RequestBody Uquvchi uquvchi) {
        return uquvchiService.update(uquvchi);
    }

    @DeleteMapping
    public void delete(@RequestBody Uquvchi uquvchi) {
        uquvchiService.delete(uquvchi);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        uquvchiService.deletebyId(id);
    }

}
