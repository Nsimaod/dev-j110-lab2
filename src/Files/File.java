// ...

package Files;

public class File
{
    private String name;
    private long size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null) {
            this.name = name;
        }
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        if(size>=0) {
            this.size = size;
        }
    }


    public File(String name, long size) {
        setName(name);
        setSize(size);
    }

    public static void printAll(File[] files)
    {
        System.out.println("        File name        |     Size      |   Details                    ");
        System.out.println("-------------------------+---------------+------------------------------");
        for(File file: files)
        {
            System.out.printf("%25s|%15s|", file.name, file.size);
            if(file instanceof Document)
            {
                System.out.println(((Document) file).getFormat()+", "+ ((Document) file).getPagesAmount()+" pages");
            }
            else if(file instanceof Image)
            {
                System.out.println(((Image) file).getImageFormat()+", "+((Image) file).getDimensions());
            }
            else if(file instanceof Media)
            {
                System.out.print(((Media) file).getMediaFormat()+", "+((Media) file).getDescription()+", "+((Media) file).getDuration());
                if(file instanceof  Video)
                {
                    System.out.println(", "+((Video) file).getImageDimensions());
                }
                else
                {
                    System.out.println();
                }
            }
        }
        System.out.println("------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        File[] files=new File[4];
        files[0]=new Document("j110-lab2-hiers.docx", 23212, "docx", 2);
        files[1]=new Image("spb-map.png",1703527,"image", new ImageDimensions(3072,1024));
        files[2]=new Media("06-PrettyGirl.mp3", 7893454, "Audio", "Eric Clapton, Pretty Girl", new MediaDuration(0,5,28));
        files[3]=new Video("BackToTheFuture1.avi", 1470984192, "Video", "Back to the Future I, 1985", new MediaDuration(1,48,8), new ImageDimensions(352,640));
        printAll(files);

        File[] videos=new Video[3];
        videos[0]=new Video("GameOfThrones 1-1.avi", 930684176, "AVI", "Game of Thrones, s 1 e 1", new MediaDuration(0,52,35), new ImageDimensions(480,640));
        videos[1]=new Video("HungerGames1.mp4", 1852765374, "MPEG-4", "Hunger Games I", new MediaDuration(2,12,20), new ImageDimensions(648,1152));
        videos[2]=new Video("DvinskClan.mov", 676594325, "QuickTime", "Dvinsk Clan - Le Parkour", new MediaDuration(0,38,41), new ImageDimensions(576,720));
        printAll(videos);
        // метод PrintAll принимает массив типа File, который является материнским классом. Передавать в него объекты дочерних типов
        // можно, так как в этом случае дочерние типы приводятся к материнскому автоматически, что позволено языком.
        // Специфические для дочерних типов поля читаются после проверки instanceof с явным приведением к дочерним типам,
        // что обеспечивает наличие и допустимый формат полей в читаемых переменных.
    }

}