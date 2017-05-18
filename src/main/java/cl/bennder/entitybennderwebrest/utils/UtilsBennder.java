/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import org.slf4j.LoggerFactory;

/**
 *
 * @author dyanez
 */
public class UtilsBennder {
    
    
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(UtilsBennder.class);
    
    /***
     * Método que genera digito verificador de rut
     * @param rut Rut sin digito verificador
     * @return Digito verificador
     */
    public static String generaDigitoVerificador(String rut) {
        int factor = 2;
        int suma = 0;
        int cantidad = 0;
        String verificador = "";
        try {
            if(rut!=null && !"".equals(rut) && !"".equals(rut.trim()) && rut.length()>0){
                    rut = rut.replaceAll("\\.", "");
                    if(rut.length() > 0){
                        cantidad = rut.length();
                        for (int i = cantidad; i > 0; i--) {
                            if (factor > 7) {
                                factor = 2;
                            }
                            suma += (Integer.parseInt(rut.substring((i - 1), i))) * factor;
                            factor++;
                        }
                        if(suma!=0){
                            verificador = String.valueOf(11 - suma % 11);
                            if ((verificador.equals("10"))) {
                                verificador = "K";
                            }
                            if (verificador.equals("11")) {
                                verificador = "0";
                            }           	
                        }
                    }
                }
            } 
        catch (Exception e) {
                    // TODO: handle exception
            verificador = "";
            log.error("Error en generaDigitoVerificador:",e);
        }

        return verificador;
    }
    
    
    /***
     * Método que escribe byte array a url de destinto
     * @param bFile array de byte
     * @param fileDest ruta de destino
     */
    //https://www.mkyong.com/java/how-to-convert-array-of-bytes-into-file/
    public  static void writeBytesToFile(byte[] bFile, String fileDest) {        
        try (FileOutputStream fileOuputStream = new FileOutputStream(fileDest)) {            
            fileOuputStream.write(bFile);
            //System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.writeBytesToFile() - fileDest: "+fileDest+"");
            log.info("[writeBytesToFile] fileDest ->{}",fileDest);
        } catch (IOException e) {
           //e.printStackTrace();
           //Logger.getLogger(UtilsBennder.class.getName()).log(Level.SEVERE, "Exception en writeBytesToFile", e);
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
         //System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.readContentIntoByteArray() - file.getAbsolutePath(): "+file.getAbsolutePath());
         log.info("[readContentIntoByteArray] file.getAbsolutePath() ->{}",file.getAbsolutePath());
         fileInputStream = new FileInputStream(file);
         fileInputStream.read(bFile);
         fileInputStream.close();
         if(bFile!=null)
         //System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.readContentIntoByteArray() - bFile.length: "+bFile.length+" Bytes.");
         log.info("[readContentIntoByteArray] bFile.length ->{} Bytes.",bFile.length);
      }
      catch (Exception e)
      {
         //e.printStackTrace();
         log.error("Error en readContentIntoByteArray",e);
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
            //e.printStackTrace();
            log.error("Error en deleteFile",e);
    	}
   }
   
   /***
    * Método encargado de limpiar los archivos de una ruta de directorio, indicando ademas si desea eliminar el directorio
    * @param rutaDirectorio 
    * @param borraDirectorio 
    */
   public static void cleanDirectory(String rutaDirectorio, boolean borraDirectorio){
       File dir = new File(rutaDirectorio);
       if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {            
                File file = new File(rutaDirectorio + File.separator + children[i]);
                if(file != null){
                    file.delete();
                }
            }
        }
       if(borraDirectorio){
           dir.delete();
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
            //System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.resizeImage() - pathImage:"+pathImage+",imgWidth:"+imgWidth+",imgHeight:"+imgHeight+",extension:"+extension);
            log.info("[resizeImage] - pathImage:"+pathImage+",imgWidth:"+imgWidth+",imgHeight:"+imgHeight+",extension:"+extension);
            
            originalImage = ImageIO.read(new File(pathImage));
            int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
            BufferedImage resizedImage = new BufferedImage(imgWidth, imgHeight, type);
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(originalImage, 0, 0, imgWidth, imgHeight, null);
            g.dispose();
            //System.out.println("cl.bennder.entitybennderwebrest.utils.UtilsBennder.resizeImage() - escribiendo imagen en disco");
            log.info("[resizeImage] - escribiendo imagen en disco");
            ImageIO.write(resizedImage, extension, new File(pathImage));

            
        } catch (IOException ex) {
            //Logger.getLogger(UtilsBennder.class.getName()).log(Level.SEVERE, null, ex);
            //ex.printStackTrace();
            log.error("Error en resizeImage",ex);
        }
        //Logger.getLogger(UtilsBennder.class.getName()).log(Level.SEVERE, "fin");
   }
   /***
    * Método que obtiene la ruta absoluta de un archivo X ubicado en la carpeta de recursos src/main/resources/xxx/xx.extension
    * @param classResources this.getClass() de la clase que se esta invocando el método
    * @param pathFileResourceFolder ruta dentro de la carpeta de resources
    * @return 
    */
   public static String getPathAbsolutaResourcesFile(Class<?> classResources,String pathFileResourceFolder){
        ClassLoader classLoader = classResources.getClassLoader();
        File file = new File(classLoader.getResource(pathFileResourceFolder).getFile());
        return file.getAbsolutePath();
    }
   /***
    * Método que permite obtener una imagen desde servidor remoto
    * @param httpImagen ruta http de la imagen
    * @return 
    */
   public static Image getImageFromServer(String httpImagen){
       URL url = null;
       Image image =  null;
       try {
           log.info("[getImageFromServer] formando url(httpImagen) ->{}",httpImagen);
           url = new URL(httpImagen);
           log.info("[getImageFromServer] leyendo la imagen desde servidor ->{}",httpImagen);
           image = ImageIO.read(url);
         
        } catch (MalformedURLException ex) {
            //ex.printStackTrace();
            log.error("Error en getImageFromServer",ex);
        }
       catch (IOException ex) {
              // ex.printStackTrace();
               log.error("Error en getImageFromServer",ex);
        }
       return image;
   }
   /***
    * 
    * @param formato formato de fecha
    * @return 
    */
   public static String getFechaActualFormato(String formato){
      String fecha = "";
      //Calendar.getInstance().getTime()
      formato = formato!=null?formato:"dd-MM-yyyy";
      SimpleDateFormat formatoDelTexto = new SimpleDateFormat(formato);
      fecha = formatoDelTexto.format(Calendar.getInstance().getTime());
      return fecha;
   }
   /***
    * 
    * @param date
    * @param formato
    * @return 
    */ 
   public static String getFechaActualFormatoJavaDate(Date date,String formato){
      String fecha = "";
      //Calendar.getInstance().getTime()
      formato = formato!=null?formato:"dd-MM-yyyy";
      SimpleDateFormat formatoDelTexto = new SimpleDateFormat(formato);
      fecha = formatoDelTexto.format(date);
      return fecha;
   }
   
   /***
    * 
    * @param date
    * @param formato
    * @return 
    */
    public static String getFechaActualFormatoSqlDate(java.sql.Date date,String formato){
      String fecha = "";
      //Calendar.getInstance().getTime()
      formato = formato!=null?formato:"dd-MM-yyyy";
      SimpleDateFormat formatoDelTexto = new SimpleDateFormat(formato);
      fecha = formatoDelTexto.format(new Date(date.getTime()));
      return fecha;
   }
    
}
