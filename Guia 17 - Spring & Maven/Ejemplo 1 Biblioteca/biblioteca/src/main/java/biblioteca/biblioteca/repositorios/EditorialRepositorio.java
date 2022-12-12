/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.biblioteca.repositorios;

import biblioteca.biblioteca.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juans
 */
@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, String>{
    
    
    
}
