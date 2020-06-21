package gmh.getmesocialservice.repository;

import gmh.getmesocialservice.model.Album;
import gmh.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();
    public Album getAlbum()
    {
        if(albumList.size()==0) {
            Album album = new Album(0, "alb_name", "alb_desc", "alb_cover");
            albumList.add(album);
        }
        return albumList.get(0);
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for(Album album: albumList)
        {
            if(album.getAlbumId()==albumId) return album;
        }
        return null;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size()+1);
        albumList.add(album);
        return album;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album a: albumList)
        {
            if(a.getAlbumId()==albumId)
            {
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for(Album a: albumList)
        {
            if(a.getAlbumId()==albumId)
            {
                deletedAlbum = a;
                albumList.remove(a);
                break;
            }
        }
        return deletedAlbum;
    }
}
