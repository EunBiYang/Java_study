package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
   // 싱글톤 패턴 시작
   private static FileHelper instance;
   
   public static FileHelper getInstance() {
      if(instance == null) instance = new FileHelper();
      return instance;
   }
   
   private FileHelper() {}
   // 싱글톤 패턴 끝
   
   /**
    * 문자열을 byte[]로 변환한뒤, 파일에 저장한다.
    * @param filePath    : 저장할 파일 경로
    * @param content   : 저장할 내용
    * @param encType   : 인코딩 형식
    * @return boolean   : 성공시 true, 실패시 false
    */
   public boolean writeString(String filePath, String content, String encType) {
      boolean result = false;
      byte[] data = null;
      
      try {
         // 문자열을 byte배열로 변환
         data = content.getBytes(encType);
      } catch (UnsupportedEncodingException e) {
         System.out.println("[ERROR] 인코딩 지정 에러");
         //e.printStackTrace();
      } catch (Exception e) {
         System.out.println("[ERROR] 알 수 없는 에러");
      }
      
      // 파일 저장
      OutputStream out = null;
      try {
         out = new FileOutputStream(filePath); // 1. 파일 생성 및 파일 오픈
         // 파일 쓰기
         out.write(data);
         // 파일 저장 성공
         result = true;
         System.out.println("[INFO] 파일 저장됨 >> " + filePath);
      } catch (FileNotFoundException e) {
         System.out.println("[ERROR] 저장 경로를 찾을 수 없음 >> " + filePath);
         //e.printStackTrace();
      } catch (IOException e) {
         System.out.println("[ERROR] 파일 저장 실패 >> " + filePath);
         //e.printStackTrace();
      } catch (Exception e) {
         System.out.println("[ERROR] 알수없는 에러 >> " + filePath);
      } finally {
         try {
            if(out != null) out.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      
      return result;
   }
   
   /**
    * 파일의 내용을 문자열로 리턴한다.
    * @param filePath    : 읽어야할 파일의 경로
    * @param encType    : 인코딩 형식
    * @return String   : 읽은 내용에 대한 문자열
    */
   public String readString(String filePath, String encType) {
      String content = null;
      byte[] data = null;
      
      // 파일 읽기
      InputStream in = null;
      try {
         in = new FileInputStream(filePath);  // 1. 파일 열기
         // 변수 만들기
         data = new byte[in.available()];
         // 파일을 읽어서 byte 배열에 저장
         in.read(data);
         System.out.println("[INFO] 파일 읽기 성공 >> " + filePath);
      } catch (FileNotFoundException e) {
         System.out.println("[ERROR] 저장 경로를 찾을 수 없음 >> " + filePath);
         //e.printStackTrace();
      } catch (IOException e) {
         System.out.println("[ERROR] 파일 읽기 실패 >> " + filePath);
         //e.printStackTrace();
      } catch (Exception e) {
         System.out.println("[ERROR] 알 수 없는 에러 >> " + filePath);
      } finally {
         try {
            if(in != null) in.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      
      // data 배열의 내용을 문자열로 변환
      if(data != null) {
         try {
            content = new String(data, encType);
         } catch (UnsupportedEncodingException e) {
            System.out.println("[ERROR] 인코딩 지정 에러");
            //e.printStackTrace();
         }
      }
      
      
      return content;
   }
}










