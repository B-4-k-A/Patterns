package structural.proxy;

public class Application {
    public static void main(String[] args) {
        RealYoutubeFunction realYoutubeFunction = new RealYoutubeFunction("some url");
        ProxyYoutubeCached proxyYoutubeCached = new ProxyYoutubeCached(realYoutubeFunction);

        proxyYoutubeCached.listVideos();
        proxyYoutubeCached.getVideosInfo();
        proxyYoutubeCached.downloadVideo();
    }
}
