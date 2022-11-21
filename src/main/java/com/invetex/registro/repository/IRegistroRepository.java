package com.invetex.registro.repository;

import com.invetex.registro.entidad.RegistroEntidad;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegistroRepository extends CrudRepository <RegistroEntidad, Long> {

    @Modifying
    @Query(value="INSERT INTO invetex.registro (id, nombre, email, password,telefono) VALUES (1030554328,'Alejandroo1','email@emaiil.com',aes_encrypt('password', 'invetex'), 3106030603)",nativeQuery = true)
    public void RegistrarUsuario (RegistroEntidad registroEntidad);

}
