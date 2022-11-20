<?php

use PHPUnit\Framework\TestCase;

class IsTheStringUppercase
{
   static function is_uppercase(string $str) :bool
   {
      // Solution 1
      // if (preg_match_all("/[A-Z.#]/", $str) == strlen(str_replace(" ", "", $str))) {
      //    return true;
      // }
      // return false;

      return $str === strtoupper($str);
   }
}

class IsTheStringUppercaseTest extends TestCase
{
   public function testFixedTests() {
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('c'));
      $this->assertEquals(true, IsTheStringUppercase::is_uppercase('C'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('hello I AM DONALD'));
      $this->assertEquals(true, IsTheStringUppercase::is_uppercase('HELLO I AM DONALD'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('ACSKLDFJSgSKLDFJSKLDFJ'));
      $this->assertEquals(true, IsTheStringUppercase::is_uppercase('ACSKLDFJSGSKLDFJSKLDFJ'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('Hello World'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('hello world'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('Hello world'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('hello World'));
      $this->assertEquals(true, IsTheStringUppercase::is_uppercase('HELLO WORLD'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('Bob walks his dog every day.'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('BOB walks his dog every day.'));
      $this->assertEquals(true, IsTheStringUppercase::is_uppercase('BOB WALKS HIS DOG EVERY DAY.'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('BOB WALKs HIS DOG EVERY DAY.'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('#lovewins'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('#Lovewins'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('#loveWins'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('#LoveWins'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('#LOVEWins'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('#LoveWINS'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('#LOVEWINs'));
      $this->assertEquals(false, IsTheStringUppercase::is_uppercase('#lOVEWINS'));
      $this->assertEquals(true, IsTheStringUppercase::is_uppercase('#LOVEWINS'));
    }
}