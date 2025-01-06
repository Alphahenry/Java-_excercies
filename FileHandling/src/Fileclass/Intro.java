package Fileclass;

import java.io.File;

//how to create a File object and use the methods in the File
//class to obtain its properties.
public class Intro {
    public static void main(String[] args) {
        java.io.File  file = new File("image/me.gif");

        //check if file exists
        System.out.println("does file exist?" + file.exists());

        //length of the file
        System.out.println("The file has length of " + file.length()  + "bytes");

        //can you read it?
        System.out.println("Can it be read?" + file.canRead());

        //can it be written

        System.out.println("can it be written?" + file.canWrite());

        //check if its a directory
        System.out.println("Is it a directory?" + file.isDirectory());

        //check if its a file
        System.out.println("is it a file?" + file.isFile());

        //check if hidden
        System.out.println("Is it hidden?" + file.isHidden());

        //does it have absolute path
        System.out.println("Absolute path?" + file.isAbsolute());

        //get absolutepath
        System.out.println("abslute path is:" + file.getAbsolutePath());
    }
}
