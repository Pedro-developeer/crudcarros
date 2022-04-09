package br.com.crudcarros.controller;

import br.com.crudcarros.models.Carros;
import br.com.crudcarros.repository.CarrosRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carros") //url base da end point
public class CarrosController {
    //Cria referência automática de objetos da classe CarrosRepository
    private final CarrosRepository carrosRepository;

    public CarrosController(CarrosRepository carrosRepository) {
        this.carrosRepository = carrosRepository;
    }

    @PostMapping("/") //Inclusão de novos carros no banco de dados
    public Carros carros(@RequestBody Carros carros) {
        return this.carrosRepository.save(carros);
    }


    @GetMapping("/listar") //listar todos os carros
    public Iterable<Carros> listar() {
        return this.carrosRepository.findAll();
    }

    @GetMapping("/{id}") //{id} é o parâmetro da requisição, ira fazer uma pelo id
    public Carros carro(@PathVariable("id") Long id) {
        return this.carrosRepository.findById(id).get();
    }
    @DeleteMapping("/{id}") //{id} é o parâmetro da requisição, ira fazer uma pelo id
    public void delete(@PathVariable("id") Long id) {
        this.carrosRepository.deleteById(id);
    }
    @GetMapping("listarmodelo/{modelo}") //{modelo} é o parâmetro da requisição, ira fazer get pelo modelo
    public Iterable<Carros> listarModelo(@PathVariable("modelo") String modelo) {
        return this.carrosRepository.findByModelo(modelo);
    }
}