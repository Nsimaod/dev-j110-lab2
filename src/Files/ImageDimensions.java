package Files;

public class ImageDimensions
{
    private Integer height;
    private Integer width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height>0) {
            this.height = height;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width>0) {
            this.width = width;
        }
    }


    public ImageDimensions(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    @Override
    public String toString()
    {
        return width.toString()+"*"+height.toString();
    }

    public static void main(String[] args) {
        ImageDimensions dim=new ImageDimensions(100,200);
        System.out.println(dim);
    }
}
