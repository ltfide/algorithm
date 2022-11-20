<?php 

class Fibonacci
{
   static function generateFibonaccis($n)
   {
      $fib = [1,1];
      for ($i=2; $i < $n; $i++) { 
         $fib[$i] = $fib[$i - 2] + $fib[$i - 1];
      }
      return $fib;
   }
}

print_r(Fibonacci::generateFibonaccis(10));