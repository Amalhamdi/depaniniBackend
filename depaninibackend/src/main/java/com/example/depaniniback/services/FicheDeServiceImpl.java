package com.example.depaniniback.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.depaniniback.entities.FicheDE;
import com.example.depaniniback.repository.FicheDeRepository;

@Service
public class FicheDeServiceImpl implements FicheDeService {
    
    private final FicheDeRepository ficheDeRepository;

    @Autowired
    public FicheDeServiceImpl(FicheDeRepository ficheDeRepository) {
        this.ficheDeRepository = ficheDeRepository;
    }

    @Override
    public FicheDE saveFicheDe(FicheDE ficheDE) {
        return ficheDeRepository.save(ficheDE);
    }

    @Override
    public FicheDE updateFicheDe(FicheDE ficheDE) {
        return ficheDeRepository.save(ficheDE);
    }

    @Override
    public void deleteFicheDe(FicheDE ficheDE) {
        ficheDeRepository.delete(ficheDE);
    }

    @Override
    public void deleteFicheDeById(Long id) {
        ficheDeRepository.deleteById(id);
    }

    @Override
    public FicheDE getFicheDe(Long id) {
        return ficheDeRepository.findById(id).orElse(null);
    }

    @Override
    public List<FicheDE> getAllFicheDe() {
        return ficheDeRepository.findAll();
    }
}
