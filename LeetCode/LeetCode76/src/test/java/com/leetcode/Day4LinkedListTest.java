package com.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Day4LinkedListTest {

   static List middleNote(List list) {
      List result = new ArrayList<>();
      
      for (int i = list.size()/2; i < list.size(); i++) {
         result.add(list.get(i));
      }

      return result;
   }
   
   @Test
   void middleOfTheLinkedList() {
      System.out.println(middleNote(List.of(1,2,3,4,5)));
   }

}
