package dev.Zerphyis.challengeJava.service;

import dev.Zerphyis.challengeJava.repository.VogalRepository;
import dev.Zerphyis.challengeJava.vogal.DadosVogal;
import dev.Zerphyis.challengeJava.vogal.Vogal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VogalService {
    @Autowired
    VogalRepository repository;

    public char encontrarVogalUnica(String input) {
        input = input.toLowerCase();
        boolean encontrouConsoante = false;
        char ultimaVogal = ' ';

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (ehVogal(c)) {
                ultimaVogal = c;
            } else if (ehConsoante(c) && ultimaVogal != ' ') {
                if (i + 1 < input.length() && ehVogal(input.charAt(i + 1))) {
                    char proximaVogal = input.charAt(i + 1);
                    if (input.indexOf(proximaVogal) == input.lastIndexOf(proximaVogal)) {
                        return proximaVogal;
                    }
                }
                encontrouConsoante = true;
            }
        }
        return ' ';
    }

    private boolean ehVogal(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private boolean ehConsoante(char c) {
        return Character.isLetter(c) && !ehVogal(c);
    }

    public void salvarResultado(DadosVogal response) {
        Vogal entity = new Vogal(response);
        repository.save(entity);
    }
}
