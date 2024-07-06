package boxcha.uz.boxcha.controller;

import boxcha.uz.boxcha.entity.KirimChiqim;
import boxcha.uz.boxcha.service.KirimChiqimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kirimchiqim")
@CrossOrigin(origins = "*", maxAge = 3600)
public class KirimChiqimConntroller {

    @Autowired
    KirimChiqimService kirimChiqimService;


    @GetMapping
    public Page<KirimChiqim> getAll(
            @RequestParam(required = false) Integer key,
            @RequestParam(required = false) Integer zarar,
            @RequestParam(required = false) Integer jamiMablag,
            Pageable pageable) {
        return kirimChiqimService.findAllByFoydaOrZararOrJamiMablagOrId(key, zarar, jamiMablag, pageable);
    }
    @PostMapping
    public KirimChiqim create(@RequestBody KirimChiqim kirimChiqim) {
        return kirimChiqimService.create(kirimChiqim);
    }

    @PutMapping
    public KirimChiqim update(@RequestBody KirimChiqim kirimChiqim) {
        return kirimChiqimService.update(kirimChiqim);
    }

    @DeleteMapping
    public void delete(@RequestBody KirimChiqim kirimChiqim) {
        kirimChiqimService.delete(kirimChiqim);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(@PathVariable Long id) {
        kirimChiqimService.deletebyId(id);
    }
}
