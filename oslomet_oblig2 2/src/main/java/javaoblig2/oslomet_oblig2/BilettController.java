package javaoblig2.oslomet_oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BilettController {

    private final List<Bilett> alleBilett = new ArrayList<>();

    @GetMapping("/lagre")
    public void lagreKunde (Bilett innBilett){
        alleBilett.add(innBilett);
    }

    @GetMapping("/hentAlle")
    public List<Bilett> hentAlle(){
        return alleBilett;
    }

    @GetMapping("/SlettAlle")
    public void Slett(){
        alleBilett.clear();
    }
}
