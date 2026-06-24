<?php
class BaseClass {
    public function test() {
        echo "BaseClass::test() called<br>";
    }
    final public function moreTesting() {
        echo "BaseClass::moreTesting() called<br>";
    }
}

class ChildClass extends BaseClass {
    public function test() {
        echo "ChildClass::test() called<br>";
    }
    // moreTesting() tidak bisa di-override karena final
    // jika dicoba akan terjadi Fatal error
}

$base  = new BaseClass();
$child = new ChildClass();

$base->test();
$base->moreTesting();
$child->test();
$child->moreTesting();
?>
