package pl.idea4u.entities.idea;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IdeaService {
    @Autowired
    IdeaRepository ideaRepository;

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/idea")
    public ResponseEntity getAllIdeas() throws JsonProcessingException {
        List<Idea> ideas = ideaRepository.findAll();

        return ResponseEntity.ok(objectMapper.writeValueAsString(ideas));
    }

    @PostMapping("/idea")
    public ResponseEntity addIdea(@RequestBody Idea newIdea) {

        Idea savedIdea = ideaRepository.save(newIdea);
        return ResponseEntity.ok(savedIdea);
    }

//    @GetMapping("/idea/last-ten")
//    public ResponseEntity getIdeas() throws JsonProcessingException {
//        List<Idea> ideas = ideaRepository.findLastTenIdeas();
//
//        return ResponseEntity.ok(objectMapper.writeValueAsString(ideas));
//    }

//    @PostMapping("/idea")
//    public ResponseEntity addNewIdea(@RequestBody Idea newIdea) {
//
//        Idea savedIdea = ideaRepository.save(newIdea);
//        return ResponseEntity.ok(savedIdea);
//    }

}
