package pl.szybiak.videoapp.service;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.szybiak.videoapp.model.VideoCassette;
import pl.szybiak.videoapp.repository.VideoAssettsRepository;

import java.time.LocalDate;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VideoACassetteService {

    private VideoAssettsRepository videoAssettsRepository;


    public Optional<VideoCassette> findById(Long id){
    return videoAssettsRepository.findById(id);
    }
    public Iterable<VideoCassette> findAll(){
        return videoAssettsRepository.findAll();
    }
    public VideoCassette save(VideoCassette videoCassette){
        return videoAssettsRepository.save(videoCassette);
    }
    public void deleteById(Long id){
        videoAssettsRepository.deleteById(id);
    }
    @EventListener(ApplicationReadyEvent.class)
    public  void fillDB(){
        save(new VideoCassette(1L, "Impossible", LocalDate.of(1993, 1, 2)));
        save(new VideoCassette(2L, "Rambo", LocalDate.of(1998, 3, 4)));
    }
}
