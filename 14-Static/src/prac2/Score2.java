
package prac2;

import java.util.Scanner;

public class Score2 {
   private String name;
   private int kor;
   private int eng;
   private int math;
   private int all;
   private double mean;
   private String grade;

   Score2() {
   }

   Score2(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
   }

   public void input() {
      Scanner sc = new Scanner(System.in);

      System.out.print("이름 : ");
      name = sc.next();
      System.out.print("국어 : ");
      kor = sc.nextInt();
      System.out.print("영어 : ");
      eng = sc.nextInt();
      System.out.print("수학 : ");
      math = sc.nextInt();
      // 총점, 평균, 학점
      calc();
      
   }

   public void calc() {
      all = kor + eng + math;
      mean = (double) all / 3;
      if (mean >= 90) {
         grade = "A";
      } else if (mean >= 80) {
         grade = "B";
      } else if (mean >= 70) {
         grade = "C";
      } else if (mean >= 60) {
         grade = "D";
      } else {
         grade = "F";
      }
   }

   public void out() {
      System.out.println(toString());
   }

   @Override
   public String toString() {
      String mean_str = String.format("%.1f", mean);
      return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + all 
            + "\t" + mean_str + "\t" + grade;
   }

   public void printTitle() {
      System.out.println("-------------------------------------------------");
      System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
      System.out.println("-------------------------------------------------");
   }

   // getter / setter
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getKor() {
      return kor;
   }

   public void setKor(int kor) {
      this.kor = kor;
   }

   public int getEng() {
      return eng;
   }

   public void setEng(int eng) {
      this.eng = eng;
   }

   public int getMath() {
      return math;
   }

   public void setMath(int math) {
      this.math = math;
   }

   public int getAll() {
      return all;
   }

   public void setAll(int all) {
      this.all = all;
   }

   public double getMean() {
      return mean;
   }

   public void setMean(double mean) {
      this.mean = mean;
   }

   public String getGrade() {
      return grade;
   }

   public void setGrade(String grade) {
      this.grade = grade;
   }   
}