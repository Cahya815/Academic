<?php
class Books {
    var $price;
    var $title;

    function __construct($par1, $par2) {
        $this->price = $par1;
        $this->title = $par2;
    }
    function __destruct() {
        echo "Objek Books dihancurkan.<br/>";
    }
    function getPrice() {
        echo $this->price . "<br/>";
        return $this->price;
    }
    function getTitle() {
        echo $this->title . "<br/>";
        return $this->title;
    }
}

class Novel extends Books {
    var $publisher;

    function setPublisher($par) {
        $this->publisher = $par;
    }
    function getPublisher() {
        echo $this->publisher . "<br/>";
    }
    function getPrice() {
        echo $this->price . "<br/>";
        return $this->price;
    }
    function getTitle() {
        echo $this->title . "<br/>";
        return $this->title;
    }
}

$novel = new Novel("Laskar Pelangi", 50000);
$novel->setPublisher("Bentang Pustaka");
$novel->getTitle();
$novel->getPrice();
$novel->getPublisher();
?>
