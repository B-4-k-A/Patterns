package structural.proxy;

public class RealYoutubeFunction implements YoutubeFunction {
    private String url;

    public RealYoutubeFunction(String url) {
        this.url = url;
    }

    @Override
    public String[] listVideos() {
        System.out.println("Get list of videos by YouTube API");
        return new String[]{"List of videos"};
    }

    @Override
    public String getVideosInfo() {
        System.out.println("Get info about videos");
        return "Some information about video";
    }

    @Override
    public void downloadVideo() {
        System.out.println("Video was downloaded");
    }
}
