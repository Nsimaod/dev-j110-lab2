package Files;

import Files.File;

public class Document extends File {
    private String format;
    private int pagesAmount;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if(format!=null) {
            this.format = format;
        }
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        if(pagesAmount>0) {
            this.pagesAmount = pagesAmount;
        }
    }


    public Document(String name, long size, String format, int pagesAmount) {
        super(name, size);
        setFormat(format);
        setPagesAmount(pagesAmount);
    }
}