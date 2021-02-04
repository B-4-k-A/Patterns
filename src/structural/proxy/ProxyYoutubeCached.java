package structural.proxy;

public class ProxyYoutubeCached implements YoutubeFunction{
    private RealYoutubeFunction realYoutubeFunction;

    private String videoInfo;

    private String[] listOfVideos;

    public ProxyYoutubeCached(RealYoutubeFunction realYoutubeFunction) {
        this.realYoutubeFunction = realYoutubeFunction;
    }

    @Override
    public String[] listVideos() {
        if(listOfVideos == null /*|| needReset*/) {
            listOfVideos = realYoutubeFunction.listVideos();
            System.out.println("List of videos cached");
        }
        return listOfVideos;
    }

    @Override
    public String getVideosInfo() {
        if(videoInfo == null) {
            videoInfo = realYoutubeFunction.getVideosInfo();
            System.out.println("Video info cached");
        }
        return videoInfo;
    }

    @Override
    public void downloadVideo() {
        realYoutubeFunction.downloadVideo();
    }
}
