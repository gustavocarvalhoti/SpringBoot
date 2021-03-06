package br.com.alura.listavip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.listavip.model.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;

@Service
public class ConvidadoService {

    @Autowired
    ConvidadoRepository repository;

    public void sendMail(String nome, String email) {
        //new EmailService().send(nome, email);
    }

    public Iterable<Convidado> findAll() {
        Convidado convidado = repository.getByNomeLike("%us%");
        List<Convidado> convidados = repository.findByNome("%us%");
        convidados = repository.findByNomeLike("%us%");
        convidados = repository.findByNacionalidade_Pais("Brasil");
        return repository.findAll();
    }

    public void save(Convidado convidado) {
        repository.save(convidado);
    }

    public List<Convidado> findByNomeOrTelefoneOrEmail(String nome, String telefone, String email) {
        return repository.findByNomeOrTelefoneOrEmail(nome, telefone, email);
    }
}