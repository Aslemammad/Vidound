
import java.io.File;
import java.util.Scanner;

/*
Vidound : project for sort videos and sounds
By : Mohammad Bagher Abiat
 */
public class Vidound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the folder address to sort files into it : ");
        String folderAdd = input.nextLine();//input.next();//folder address
        if (folderAdd.endsWith("/")) {
            folderAdd = folderAdd.substring(0, folderAdd.length() - 1);
        }
        File Object_of_folderAdd = new File(folderAdd);//object of folder address
        String[] fileList = Object_of_folderAdd.list();//array for files into folder list

        for (String path : fileList) {//for each for path
            if (path.endsWith(".mp3") || path.endsWith(".3gp") || path.endsWith(".jpg") || path.endsWith(".png") || path.endsWith(".m4a") || path.endsWith(".wav") || path.endsWith(".webm") || path.endsWith(".wmv") || path.endsWith(".mp4") || path.endsWith("mkv") || path.endsWith(".mp4") || path.endsWith(".wmv") || path.endsWith(".mpg") || path.endsWith(".mpeg") || path.endsWith(".m2v") || path.endsWith(".m4v")) {

                String sortFolder = folderAdd + "/sorted/" + path;
                File sortFolder_object = new File(sortFolder);
                sortFolder_object.mkdirs();
                File file = new File(folderAdd + "/" + path);
                file.renameTo(new File(sortFolder + "/" + path));
            }
        }
        System.out.print("\u001B[32msuccessfully\n\n");
    }

}
