
package com.practica.egg.proyecto.repositorios;

import com.practica.egg.proyecto.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAutor extends JpaRepository<Autor, String> {
    
    @Query("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    public Autor buscarPorNombre(@Param("nombre")String nombre);
    
}
