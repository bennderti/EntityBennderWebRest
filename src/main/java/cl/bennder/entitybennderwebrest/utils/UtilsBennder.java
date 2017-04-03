/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author dyanez
 */
public class UtilsBennder {
    
    /***
     * Método que escribe byte array a url de destinto
     * @param bFile array de byte
     * @param fileDest ruta de destino
     */
    //https://www.mkyong.com/java/how-to-convert-array-of-bytes-into-file/
    public  static void writeBytesToFile(byte[] bFile, String fileDest) {        
        try (FileOutputStream fileOuputStream = new FileOutputStream(fileDest)) {            
            fileOuputStream.write(bFile);
            System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.writeBytesToFile() - fileDest: "+fileDest+"");
        } catch (IOException e) {
           //e.printStackTrace();
           Logger.getLogger(UtilsBennder.class.getName()).log(Level.SEVERE, "Exception en writeBytesToFile", e);
        }

    }
   /***
    * Obtiene los bytes de una archivo
    * @param file Archivo File
    * @return Contenido en byte array de una archivo file
    */ 
   public static byte[] readContentIntoByteArray(File file)
   {
      FileInputStream fileInputStream = null;
      byte[] bFile = new byte[(int) file.length()];
      try
      {
         //convert file into array of bytes
         System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.readContentIntoByteArray() - file.getAbsolutePath(): "+file.getAbsolutePath());
         fileInputStream = new FileInputStream(file);
         fileInputStream.read(bFile);
         fileInputStream.close();
         if(bFile!=null)
         System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.readContentIntoByteArray() - bFile.length: "+bFile.length+" Bytes.");
      }
      catch (Exception e)
      {
         e.printStackTrace();
         //Logger.getLogger(UtilsBennder.class.getName()).log(Level.SEVERE, "Exception en readContentIntoByteArray", e);
      }
      return bFile;
   }
   /***
    * Elimina un archivo en determinada ruta
    * @param pathFile ruta de achivo a eliminar
    */
   public static void deleteFile(String pathFile){
       
        try{
            
            File file = new File(pathFile);
            if(file != null){
                file.delete();
            }
    	}catch(Exception e){
            e.printStackTrace();
    	}
   }
   /***
    * Método que permite escalar o redimensionar la imagen
    * @param pathImage ruta de imagen entrada y salida
    * @param imgWidth ancho de imagen final
    * @param imgHeight alto de imagen final
    * @param extension Extension de imagen de salida (png,jpg)
    */
   //https://www.mkyong.com/java/how-to-resize-an-image-in-java/
   public static void resizeImage(String pathImage,int imgWidth, int imgHeight, String extension){
        BufferedImage originalImage;
        //Logger.getLogger(UtilsBennder.class.getName()).log(Level.SEVERE, "inicio");
       // System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.resizeImage() - file.getAbsolutePath(): "+file.getAbsolutePath());
        try {
            System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.resizeImage() - pathImage:"+pathImage+",imgWidth:"+imgWidth+",imgHeight:"+imgHeight+",extension:"+extension);
            originalImage = ImageIO.read(new File(pathImage));
            int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
            BufferedImage resizedImage = new BufferedImage(imgWidth, imgHeight, type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(originalImage, 0, 0, imgWidth, imgHeight, null);
            g.dispose();
            System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.resizeImage() - escribiendo imagen en disco");
            ImageIO.write(resizedImage, extension, new File(pathImage));

            
        } catch (IOException ex) {
            //Logger.getLogger(UtilsBennder.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        //Logger.getLogger(UtilsBennder.class.getName()).log(Level.SEVERE, "fin");
   }
    
}
