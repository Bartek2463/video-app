package pl.szybiak.videoapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.szybiak.videoapp.model.VideoCassette;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/cassetts")
public class VideoCassetteApi {

    private List<VideoCassette> videoCassettes;

    public VideoCassetteApi() {
        videoCassettes = new ArrayList<>();
        videoCassettes.add(new VideoCassette(1L, "Impossible", LocalDate.of(1993, 1, 2)));
        videoCassettes.add(new VideoCassette(2L, "Rambo", LocalDate.of(1998, 3, 4)));
    }
    @GetMapping("/all")
    public List<VideoCassette> getAll(){
        return videoCassettes;
    }
    @GetMapping
    public VideoCassette getByid(@RequestParam int index){
        Optional<VideoCassette> first = videoCassettes.stream()
                .filter(param -> param.getId() == index).findFirst();
        return first.get();
    }
    @PostMapping
    public boolean addVideo(@RequestBody VideoCassette videoCassette){
        return videoCassettes.add(videoCassette);
    }
    @PutMapping
    public boolean updateVideo(@RequestParam VideoCassette videoCassette){
        return videoCassettes.add(videoCassette);
    }
    @DeleteMapping
    public boolean deleteVideo(@RequestParam int index){
         return videoCassettes.removeIf(element ->element.getId()==index);
    }
}
