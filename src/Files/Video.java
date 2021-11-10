package Files;

public class Video extends Media
{
    ImageDimensions imageDimensions;

    public Video(String name, long size, String mediaFormat, String description, MediaDuration duration, ImageDimensions imageDimensions) {
        super(name, size, mediaFormat, description, duration);
        this.imageDimensions=imageDimensions;
    }

    public ImageDimensions getImageDimensions() {
        return imageDimensions;
    }

    public void setImageDimensions(ImageDimensions imageDimensions) {
        if(imageDimensions!=null) {
            this.imageDimensions = imageDimensions;
        }
    }
}
