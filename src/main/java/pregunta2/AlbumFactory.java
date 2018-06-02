package pregunta2;

public class AlbumFactory {
	
	// Factory Method
    public Album getAlbum(String tipo) {
    	Album album = null;
        if (tipo.equals("VINIL")) {
            album = new VinilAlbum();
        } else if (tipo.equals("CD")) {
        	album = new CDAlbum();
        }
        
        return album;
    }
}
