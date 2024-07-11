package com.challenge.alura.literatura.repository;

import com.challenge.alura.literatura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    Libro findLibroByTitulo(String nombre);
    List<Libro> findLibrosByIdiomasContaining(String idiomas);
}
