<?php
class MyClass {
    const requiredMargin = 1.7;

    function __construct($incomingValue) {
        echo "Objek dibuat dengan nilai: $incomingValue <br/>";
    }
}

$obj = new MyClass(100);
echo "Required Margin: " . MyClass::requiredMargin . "<br/>";
?>
