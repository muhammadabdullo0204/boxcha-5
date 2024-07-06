package boxcha.uz.boxcha.controller;


import boxcha.uz.boxcha.entity.Dars;
import boxcha.uz.boxcha.service.DarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dars")
@CrossOrigin(origins = "*" , maxAge = 3600)
public class DarsController {


    @Autowired
    DarsService darsService;

    @GetMapping
    public Page<Dars> getAll(Pageable pageable) {
        return darsService.getAll(pageable);
    }

    @PostMapping
    public Dars create(@RequestBody Dars dars) {
        return darsService.create(dars);
    }

    @PutMapping
    public Dars update(@RequestBody Dars dars) {
        return darsService.update(dars);
    }

    @DeleteMapping
    public void delete(@RequestBody Dars dars) {
        darsService.delete(dars);
    }

    @DeleteMapping("/{id}")
    public void deletebyId( @PathVariable Long id) {
        darsService.deletebyId(id);
    }


}
