# ISO8583-Parsing
an iso8583 message parsing


// Simple ISO8583 Parser Class
// jcbrunhera@gmail.com


Example
using Scala:


> scala -cp :\j\java\iso_project\*

scala> :require isoLibrary.jar
Added 'C:\j\java\Projects\iso_project\isoLibrary\dist\isoLibrary.jar' to classpath.

scala> import iso._;
import iso._





scala> val iso1 = new msgISO();

scala>
iso1.doClear();
iso1.setMIT("0200");
iso1.set_bit(3, "932900"); 
iso1.set_bit(4,"000000003000");
iso1.set_bit(11, "000001");
iso1.set_bit(13,"0521");
iso1.set_bit(22,"000");
iso1.set_bit(32,"237");
iso1.set_bit(41,"00000001");
iso1.set_bit(42, "001202000000100"); 
iso1.set_bit(49,"986");
iso1.set_bit(63,"01502SOF03.3001.10");
iso1.makeIsoMsg();     

iso1.getMsg();



scala> val iso2 = new msgISO();

scala> iso2.setMsg("02003028040100C080029329000000000030000000010521000032370000000100120200000010098601801502SOF03.3001.10");

scala> iso2.loadFields();

scala> iso2.getMIT();
res58: String = 0200

scala> iso2.get_bit(42);
res59: String = 001202000000100

scala>


