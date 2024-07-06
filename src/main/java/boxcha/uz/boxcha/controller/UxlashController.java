package boxcha.uz.boxcha.controller;

import boxcha.uz.boxcha.entity.Uxlash;
import boxcha.uz.boxcha.service.UxlashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/uxlash")
@CrossOrigin(origins = "*" , maxAge = 3600)
public class UxlashController {

    @Autowired
    UxlashService uxlashService;

    @GetMapping
    public Page<Uxlash> findAll(
            @RequestParam(required = false) Integer key,
            @RequestParam(required = false) Integer davomiyligi,
            @RequestParam(required = false) Integer jamiOquvchiSoni,
            @RequestParam(required = false) Integer uxlaganOquvchiSoni,
            @RequestParam(required = false) Integer uxlamaganOquvchiSoni,
            Pageable pageable) {

        // Convert null parameters to empty values if needed
        if (key == null) key = 0;
        if (davomiyligi == null) davomiyligi = 0;
        if (jamiOquvchiSoni == null) jamiOquvchiSoni = 0;
        if (uxlaganOquvchiSoni == null) uxlaganOquvchiSoni = 0;
        if (uxlamaganOquvchiSoni == null) uxlamaganOquvchiSoni = 0;

        return uxlashService.findAllByVaqtContainsIgnoreCaseOrDavomiyligiContainsIgnoreCaseOrJamiOquvchiSoniContainsIgnoreCaseOrUxlaganOquvchiSoniContainsIgnoreCaseOrUxlamaganOquvchiSoniOrId(
                key, davomiyligi, jamiOquvchiSoni, uxlaganOquvchiSoni, uxlamaganOquvchiSoni, pageable);
    }

    @PostMapping
    public Uxlash create(@RequestBody Uxlash uxlash) {
        return uxlashService.create(uxlash);
    }

    @PutMapping
    public Uxlash update(@RequestBody Uxlash uxlash) {
        return uxlashService.update(uxlash);
    }

    @DeleteMapping
    public void delete(@RequestBody Uxlash uxlash) {
        uxlashService.delete(uxlash);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(@PathVariable Long id) {
        uxlashService.deletebyId(id);
    }
}
