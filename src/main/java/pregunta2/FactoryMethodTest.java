package pregunta2;

public class FactoryMethodTest {
	public static void main(String[] args) {
        AlbumFactory albumFactory = new AlbumFactory();
        Album album = albumFactory.getAlbum("CD");
        album.albumTipo();
    }
}
