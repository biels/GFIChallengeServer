package gfi.entities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;


/**
 * Created by Biel on 9/10/2016.
 */
public class Animation {
    List<Sequence> sequences = new ArrayList<>();

    public Animation(File file, int size) {
        File anim = new File(file.getPath() + "/anim.txt");
        try {

            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    //one sequence
                    Scanner mainSc = new Scanner(anim);
                    Sequence seq = new Sequence();
                    BufferedImage image;
                    try {
                        while (mainSc.hasNext()){
                            String line = mainSc.nextLine();
                            String[] arr = line.split(" ");
                            String imgName = arr[0];
                            int milis = Integer.parseInt(arr[1]);
                            image = ImageIO.read(new File(file.getPath() + "/" + imgName + ".bmp"));
                            String hex = "#" + Integer.toHexString(image.getRGB(i, j)).toUpperCase();
                            seq.add(new SequenceFrame(hex, milis));
                        }
                        sequences.add(seq);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public List<Sequence> getSequences() {
        return sequences;
    }
}
