package boxcha.uz.boxcha.controller;

import boxcha.uz.boxcha.entity.Xona;
import boxcha.uz.boxcha.service.XonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/xona")
@CrossOrigin(origins = "*", maxAge = 3600)
public class XonaController {
    @Autowired
    XonaService xonaService;

    @GetMapping
    public Page<Xona> findAllByNomContainsIgnoreCaseOrSigimiContainsIgnoreCaseOrJihozlarContainsIgnoreCaseOrId(String key, String sigimi, String jihozlar, Pageable pageable) {
        if (key == null) key = "";
        return xonaService.findAllByNomContainsIgnoreCaseOrSigimiContainsIgnoreCaseOrJihozlarContainsIgnoreCaseOrId(key, sigimi, jihozlar, pageable);
    }


    @PostMapping
    public Xona create(@RequestBody Xona xona) {
        return xonaService.create(xona);
    }

    @PutMapping
    public Xona update(@RequestBody Xona xona) {
        return xonaService.update(xona);
    }

    @DeleteMapping
    public void delete(@RequestBody Xona xona) {
        xonaService.delete(xona);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(@PathVariable Long id) {
        xonaService.deletebyId(id);
    }
}
