package boxcha.uz.boxcha.controller;


import boxcha.uz.boxcha.entity.Uqituvchi;
import boxcha.uz.boxcha.service.UqituvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/uqituvchi")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UqituvchiController {

    @Autowired
    @Qualifier("uqituvchiServiceImpl")
    UqituvchiService uqituvchiService;

    @GetMapping("/search")
    public Page<Uqituvchi> getAll(
            @RequestParam(required = false) String ism,
            @RequestParam(required = false) String familiya,
            @RequestParam(required = false) String sharif,
            @RequestParam(required = false) String jins,
            Pageable pageable) {
        if (ism == null) ism = "";
        if (familiya == null) familiya = "";
        if (sharif == null) sharif = "";
        if (jins == null) jins = "";
        return uqituvchiService.findAllByIsmContainsIgnoreCaseOrFamiliyaContainsIgnoreCaseOrSharifContainsIgnoreCaseOrJinsContainsIgnoreCase(ism, familiya, sharif, jins, pageable);
    }

    @GetMapping("/filter")
    public Page<Uqituvchi> getAll(
            @RequestParam(required = false) Integer yosh,
            @RequestParam(required = false) Integer maosh,
            Pageable pageable) {
        if (yosh == null) yosh = 0;
        if (maosh == null) maosh = 0;
        return uqituvchiService.findAllByYoshOrMaosh(yosh, maosh, pageable);
    }

    @PostMapping
    public Uqituvchi create(@RequestBody Uqituvchi uqituvchi) {
        return uqituvchiService.create(uqituvchi);
    }

    @PutMapping
    public Uqituvchi update(@RequestBody Uqituvchi uqituvchi) {
        return uqituvchiService.update(uqituvchi);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        uqituvchiService.deletebyId(id);
    }
}
