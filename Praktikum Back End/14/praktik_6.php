<?php
abstract class MyAbstractClass {
    abstract function myAbstractFunction();
}

class MyConcreteClass extends MyAbstractClass {
    function myAbstractFunction() {
        echo "Implementasi dari myAbstractFunction.<br/>";
    }
}

class Foo {
    public static $my_static = 'foo';

    public function staticValue() {
        return self::$my_static;
    }
}

$concrete = new MyConcreteClass();
$concrete->myAbstractFunction();

echo Foo::$my_static . "<br/>";
$foo = new Foo();
echo $foo->staticValue() . "<br/>";
?>
