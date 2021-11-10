package Files;

public class Image extends File
{
    private String imageFormat;
    ImageDimensions dimensions;

    public String getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(String imageFormat) {
        if(imageFormat!=null) {
            this.imageFormat = imageFormat;
        }
    }

    public ImageDimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(ImageDimensions dimensions) {
        if(dimensions!=null) {
            this.dimensions = dimensions;
        }
    }


    public Image(String name, long size, String imageFormat, ImageDimensions dimensions) {
        super(name, size);
        setImageFormat(imageFormat);
        setDimensions(dimensions);
    }
}
