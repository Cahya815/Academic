<?php
class MyClass {
    private $car = "skoda";
    public $driver = "SRK";

    function __construct($par) {
        echo "Objek dibuat dengan parameter: $par <br/>";
    }
    function myPublicFunction() {
        return "I'm visible!";
    }
    private function myPrivateFunction() {
        return "I'm not visible outside!";
    }
}

$obj = new MyClass("test");
echo $obj->driver . "<br/>";
echo $obj->myPublicFunction() . "<br/>";
?>
