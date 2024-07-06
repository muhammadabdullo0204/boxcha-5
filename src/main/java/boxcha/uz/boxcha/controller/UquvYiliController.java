package boxcha.uz.boxcha.controller;


import boxcha.uz.boxcha.entity.UquvYili;
import boxcha.uz.boxcha.service.UquvyiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/uquvyili")
@CrossOrigin(origins = "*" , maxAge = 3600)
public class UquvYiliController {
    @Autowired
    UquvyiliService uquvyiliService;

    @GetMapping
    public Page<UquvYili> getAll(
            @RequestParam(required = false) LocalDate key,
            @RequestParam(required = false) LocalDate tugaganVaqt,
            @RequestParam(required = false) Integer jamiOquvchilar,
            Pageable pageable) {
        if (key == null) key = LocalDate.now(); // Replace with appropriate default value
        return uquvyiliService.findAllByBoshlanganVaqtOrTugaganVaqtOrJamiOquvchilarOrId(key, tugaganVaqt, jamiOquvchilar, pageable);
    }


    @PostMapping
    public UquvYili create(@RequestBody UquvYili uquvYili) {
        return uquvyiliService.create(uquvYili);
    }

    @PutMapping
    public UquvYili update(@RequestBody UquvYili uquvYili) {
        return uquvyiliService.update(uquvYili);
    }

    @DeleteMapping
    public void delete(@RequestBody UquvYili uquvYili) {
        uquvyiliService.delete(uquvYili);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(@PathVariable Long id) {
        uquvyiliService.deletebyId(id);
    }
}
