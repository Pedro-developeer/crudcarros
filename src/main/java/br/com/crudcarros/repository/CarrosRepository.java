package br.com.crudcarros.repository;
import br.com.crudcarros.models.Carros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrosRepository extends JpaRepository<Carros, Long> {

    Iterable<Carros> findByModelo(String modelo);
}