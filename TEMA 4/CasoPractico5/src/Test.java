public class Test {
    public static void main (String[]args){
        PuestoTrabajo pt1=new PuestoTrabajo("PT01","Puesto 1",2000);
        PuestoTrabajo pt2=new PuestoTrabajo("PT02","Puesto 2",3500);
        PuestoTrabajo pt3=new PuestoTrabajo("PT03","Puesto 3",1900);
        Empleado e1=new Empleado("26268135L","Rafael","Medina Quelle","Avenida Manuel Gorria","29013","Málaga",pt2);
        Administrativo a = new Administrativo("98765432Z","Juanita","Campanilla","Otracalle","87654","Otra de abajo",pt2,10);
        Consultor c = new Consultor("78934265H","Gregorio","López","Callesinsalida","65432","Estaciudad",pt3,"Jefe");
        e1.getAtributos();
        System.out.println();
        a.getAtributos();
        c.getAtributos();

    }
}
