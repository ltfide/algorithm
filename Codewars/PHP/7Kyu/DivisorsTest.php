<?php

use PHPUnit\Framework\TestCase;

class Divisors 
{
   static function divisors(int $num) 
   {
      // $result = 0;
      // for ($i=1; $i <= $num; $i++) { 
      //    if ($num % $i === 0) {
      //       $result++;
      //    }
      // }
      // return $result;
      
      return count(array_filter(range(1, $num), function($n)use($num){ 
         return $num%$n==0; 
      }));
   }
}

// print_r(Divisors::divisors(10)); // 1 2 5 10

class DivisorsTest extends TestCase
{
   public function testDivisors()
   {
      $this->assertEquals(1, Divisors::divisors(1));
      $this->assertEquals(4, Divisors::divisors(10));
      $this->assertEquals(2, Divisors::divisors(11));
      $this->assertEquals(8, Divisors::divisors(54));
      $this->assertEquals(7, Divisors::divisors(64));
   }
}