package Practica_Padron;
public class Habitante {
     String nombre;
     String apellido1;
     String apellido2;
   
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setApellido1(String apellido1){
            this.apellido1 = apellido1;
        }
        public void setApellido2(String apellido2){
            this.apellido2 = apellido2;
        }
        public String getNombre(){
            return nombre;
        }
        public String getApellido1(){
            return apellido1;
        }
        public String getApellido2(){
            return apellido2;
        }
        public static void realizarComprobacion(){
            Habitante habitante1 = new Habitante();
            habitante1.setNombre("Vegeta");
            habitante1.setApellido1("Gaymer");
            habitante1.setApellido2("777");
            System.out.println(habitante1.getNombre() + " " +habitante1.getApellido1() + " " +habitante1.getApellido2() + "");
            
            
    
    }
    }
    