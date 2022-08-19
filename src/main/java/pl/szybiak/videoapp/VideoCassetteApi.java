package pl.szybiak.videoapp;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class VideoCassetteApi {

    private List<VideoCassette> videoCassettes;

    public VideoCassetteApi(){
        videoCassettes = new ArrayList<>();
        videoCassettes.add(new VideoCassette(1L,"Impossible", LocalDate.of(1993,1,2)));
    }
}
