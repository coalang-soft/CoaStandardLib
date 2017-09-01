#use Stream prototypes

var stdin,stdout;
var printf,print,read;
{
    var System = java("java.lang.System");

    var in = System.in;
    var out = System.out;

    stdin = Stream(in);
    stdout = Stream(out);

    println = out.println;
    printf = out.printf;
    print = out.print;

    read = java("java.util.Scanner")(in).nextLine;
};

prototypes.string.printf = ({|self,a...| printf(self,a);});
prototypes.object.print = print;
prototypes.object.println = println;