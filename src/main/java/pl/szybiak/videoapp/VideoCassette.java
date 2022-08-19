package pl.szybiak.videoapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class VideoCassette {
    private Long id;
    private String title;
    private LocalDate productionYear;



}
