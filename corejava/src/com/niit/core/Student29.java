package com.niit.core;

import java.util.Comparator;

class Student29
{
    int rollno;
    String name, address;
//Constructor
    public Student29(int rollno, String name, String address)
          {
              this.rollno = rollno;
              this.name = name;
              this.address = address;
          }
//Used to print student details in main()
   public String toString()
         {
              return this.rollno + " " + this.name +
                                 " " + this.address;
        }
 }
class Sortbyroll implements Comparator<Student29>
   {
//Used for sorting in ascending order of roll number
        public int compare(Student29 a, Student29 b)
            {
                return a.rollno - b.rollno;
            }
   }
class Sortbyname implements Comparator<Student29>
  {
//Used for sorting in ascending order of roll name
      public int compare(Student29 a, Student29 b)
           {
                return a.name.compareTo(b.name);
           }
  }
