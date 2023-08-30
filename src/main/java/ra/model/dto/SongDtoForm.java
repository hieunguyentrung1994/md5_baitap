package ra.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class SongDtoForm {
    private Long id;
    private String nameAlbuml;
    private boolean status;
    private String singer;
    private String content;
    private MultipartFile url;

    public SongDtoForm() {
    }

    public SongDtoForm(Long id, String nameAlbuml, boolean status, String singer, String content, MultipartFile url) {
        this.id = id;
        this.nameAlbuml = nameAlbuml;
        this.status = status;
        this.singer = singer;
        this.content = content;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameAlbuml() {
        return nameAlbuml;
    }

    public void setNameAlbuml(String nameAlbuml) {
        this.nameAlbuml = nameAlbuml;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MultipartFile getUrl() {
        return url;
    }

    public void setUrl(MultipartFile url) {
        this.url = url;
    }
}
