package gmh.getmesocialservice.resource;

import gmh.getmesocialservice.model.Album;
import gmh.getmesocialservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/album")
    public Album getAlbum() { return albumService.getAlbum(); }

    @GetMapping("/album/{albumId}")
    public Album getAlbumById(@PathVariable("albumId") int albumId)
    {
        return albumService.getAlbumById(albumId);
    }

    @GetMapping("/allAlbums")
    public List<Album> getAllUsers()
    {
        return albumService.getAllAlbums();
    }

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album)
    {
        return albumService.saveAlbum(album);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album album)
    {
        return albumService.updateAlbum(albumId, album);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name = "albumId") int albumId)
    {
        return albumService.deleteAlbum(albumId);
    }
}
