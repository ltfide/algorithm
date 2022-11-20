<?php

use PHPUnit\Framework\TestCase;

class YouOnlyNeedOne
{
   static function solution(array $arr, $x) :bool
   {
      return in_array($x, $arr);
   }
}

class YouOnlyNeedOneTest extends TestCase
{
   public function testThatSomethingShouldHappen() {
      $this->assertTrue(YouOnlyNeedOne::solution(array('a', 'b', 'c', 'd', 'e', "f"), "a"));
      $this->assertTrue(YouOnlyNeedOne::solution(array('a', 'b', 'c', 'd', 'e', "f"), "f"));
      $this->assertTrue(YouOnlyNeedOne::solution(array('a', 'b', 'c', 'd', 'e', "f"), "c"));
      $this->assertFalse(YouOnlyNeedOne::solution(array('a', 'b', 'c', 'd', 'e', "f"), "y"));
      $this->assertFalse(YouOnlyNeedOne::solution(array('a', 'b', 'c', 'd', 'e', "f"), null));
   }
}