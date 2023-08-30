package ra.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import ra.model.dto.SongDtoForm;
import ra.model.entirty.Song;
import ra.model.repository.ISongRepository;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class SongService {
    @Autowired
    private ISongRepository songRepository;


    public List<Song> findAll() {

        return songRepository.findAll();
    }

    public Song findById(Long id) {

        return songRepository.findByID(id);
    }
    public void delete(Long id) {
        songRepository.delete(id);
    }

    public void save(SongDtoForm songDto) {
        String uploadPath = "D:\\document\\md5\\bai1\\demo1\\src\\main\\webapp\\WEB-INF\\views\\upload\\";
        // xử lí chuyển đổi
        // upload file
        String filename = null;
        if(!(songDto.getUrl().isEmpty())){
            filename = songDto.getUrl().getOriginalFilename();
            try {
                FileCopyUtils.copy(songDto.getUrl().getBytes(),new File(uploadPath+filename));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // chuyển từ dto thành entity
        Song song = new Song(songDto.getId(),
                songDto.getNameAlbuml(),songDto.isStatus(),
                songDto.getSinger(),songDto.getContent(), filename);
        songRepository.save(song);
    }

}
