package br.com.casadocodigo.controllers;

import br.com.casadocodigo.dtos.StateDto;
import br.com.casadocodigo.forms.StateForm;
import br.com.casadocodigo.models.State;
import br.com.casadocodigo.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/states")
public class StateController {

    //+1
    @Autowired
    private StateRepository stateRepository;

    @PostMapping                                                        //+1
    public ResponseEntity<StateDto> createState(@RequestBody @Valid StateForm stateForm){

        //+1
        State state = stateForm.toEntity();

        //+1
        if(state != null){
            stateRepository.save(state);     //+1
            return ResponseEntity.ok(new StateDto(state));
        }

        return ResponseEntity.badRequest().build();

    }
}
