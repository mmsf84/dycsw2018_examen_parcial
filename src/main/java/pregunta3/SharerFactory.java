package pregunta3;

public enum SharerFactory {
    FACTORY;
    
    public Sharing getSharer(SharerType sharerType) {
        Sharing sharing = null;
        switch (sharerType) {
            case Facebook: sharing = new FacebookSharer(); break;
            case Twitter: sharing = new TwitterSharer(); break;
            case Reddit: sharing = new RedditSharer(); break;
            default : break;
        }
        return sharing;
    }
}
