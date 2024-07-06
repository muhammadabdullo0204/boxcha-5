package boxcha.uz.boxcha.controller;


import boxcha.uz.boxcha.entity.Davomat;
import boxcha.uz.boxcha.service.DavomatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/davomat")
@CrossOrigin(origins = "*" , maxAge = 3600)
public class DavomatController {
    @Autowired
    DavomatService davomatService;

    public Page<Davomat> getALl(@RequestParam(required = false)Integer key, Integer kelmaganlarSoni, Integer jamiOquvchilar, Pageable pageable) {
        if (key == null) key = Integer.valueOf("");
        return davomatService.findAllByKelganlarSoniContainsIgnoreCaseOrKelmaganlarSoniContainsIgnoreCaseOrJamiOquvchilarContainsIgnoreCaseOrId(key, kelmaganlarSoni, jamiOquvchilar, pageable);
    }

    @PostMapping
    public Davomat create(@RequestBody Davomat davomat) {
        return davomatService.create(davomat);
    }

    @PutMapping
    public Davomat update(@RequestBody Davomat davomat) {
        return davomatService.update(davomat);
    }

    @DeleteMapping
    public void delete(@RequestBody Davomat davomat) {
        davomatService.delete(davomat);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(@PathVariable Long id) {
        davomatService.deletebyId(id);
    }
}
