package ra.model.entirty;

import javax.persistence.*;
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameAlbuml;
    private boolean status;
    private String singer;
    private String content;
    private String url;

    public Song() {
    }

    public Song(Long id, String nameAlbuml, boolean status, String singer, String content, String url) {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    public void coppy(Song s) {
    this.id = s.getId();
    this.content = s.getContent();
    this.nameAlbuml = s.getNameAlbuml();
    this.status = s.isStatus();
    this.singer=s.getSinger();
    this.url = s.getUrl();

    }
}
