package ait.album.dao.ait.album.dao;

import ait.album.dao.ait.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class AlbumImpl implements Album {
    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity) {
        this.photos = new Photo[capacity];
    }


    @Override
    public boolean addPhoto(Photo photo) {

        boolean isInvalid = photo == null;
        if (isInvalid) {
            return false;
        }

        boolean isPhotoAlreadyAdded = getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null;
        if (isPhotoAlreadyAdded) {
            return false;
        }

        boolean hasSlot = size == photos.length;
        if (hasSlot) {
            return false;
        }

        photos[size++] = photo;
        if (size > 0) {
            Arrays.sort(photos, 0, size);
        }
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId) {
                System.arraycopy(photos, i + 1, photos, i, size - i - 1);
                photos[size] = null;
                size--;
//                photos[i] = photos[size];
//                photos[size] = null;
//                size--;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photoFromAlbum = getPhotoFromAlbum(photoId, albumId);

        if (photoFromAlbum != null) {
            photoFromAlbum.setUrl(url);
            return true;
        }

        return false;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId) {
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        Photo[] result = new Photo[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId) {
                result[counter++] = photos[i];
            }
        }

        return Arrays.copyOf(result, counter);
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {

        LocalDateTime dateFromPlusTime = dateFrom.atStartOfDay();
        LocalDateTime dateToPlusTime = dateTo.plusDays(1).atStartOfDay();

        Photo[] arrayPhotoBetweenDate = new Photo[size];

        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (photos[i].getDate().isAfter(dateFromPlusTime) && photos[i].getDate().isBefore(dateToPlusTime)) {
                arrayPhotoBetweenDate[counter++] = photos[i];
            }
        }

        return Arrays.copyOf(arrayPhotoBetweenDate, counter);
    }

    @Override
    public int size() {
        return size;
    }
}
