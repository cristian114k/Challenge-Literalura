package com.challenge.alura.literatura.repository;

import com.challenge.alura.literatura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor findAutorByNombreIgnoreCase(String nombre);
    List<Autor> findAutorByFechaDeNacimientoLessThanEqualAndFechaDeFallecimientoGreaterThanEqual(int fechaDeNacimiento, int fechaDeFallecimiento);
}