<?php
class Name {
    var $_firstName;
    var $_lastName;

    function __construct($first_name, $last_name) {
        $this->_firstName = $first_name;
        $this->_lastName  = $last_name;
    }
    function toString() {
        return ($this->_lastName . ", " . $this->_firstName);
    }
}

class NameSub1 extends Name {
    var $_middleInitial;

    function __construct($first_name, $middle_initial, $last_name) {
        parent::__construct($first_name, $last_name);
        $this->_middleInitial = $middle_initial;
    }
    function toString() {
        return (parent::toString() . " " . $this->_middleInitial);
    }
}

$name = new Name("John", "Doe");
echo $name->toString() . "<br/>";

$nameSub = new NameSub1("John", "M", "Doe");
echo $nameSub->toString() . "<br/>";
?>
