package Files;

public class Media extends File
{
    private String mediaFormat;
    private String description;
    MediaDuration duration;

    public Media(String name, long size, String mediaFormat, String description, MediaDuration duration) {
        super(name, size);
        setMediaFormat(mediaFormat);
        setDescription(description);
        setDuration(duration);
    }

    public String getMediaFormat() {
        return mediaFormat;
    }

    public void setMediaFormat(String mediaFormat) {
        if(mediaFormat!=null) {
            this.mediaFormat = mediaFormat;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description!=null) {
            this.description = description;
        }
    }

    public MediaDuration getDuration() {
        return duration;
    }

    public void setDuration(MediaDuration duration) {
        if(duration!=null) {
            this.duration = duration;
        }
    }
}
