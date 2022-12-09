package Ejercicio01.Dia3;

import java.util.Scanner;

public class EjercicioReloj {
    int hora= 0;
    int minuto=0;
    int segundos=0;


    EjercicioReloj (){
        hora=12;
        minuto = 00;
        segundos = 00;
    }
    EjercicioReloj (int hora, int minuto, int segundos){
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
    }
    EjercicioReloj (int segundo){convertir(segundo);}
    public int getHora(){return hora;}
    public int getMinuto(){return minuto;}

    public int getSegundos() {return segundos;}

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    //metodo detReloj para actualizar el valor de la hora
    public void setReloj(int segundo){
        hora=00;
        minuto=00;
        segundos=00;
        convertir(segundos);
    }
    public void convertir(int segundos) {
        this.hora = segundos / 3600;
        this.minuto = (segundos - (hora * 3600)) / 60;
        this.segundos = (segundos - (hora * 3600)) - (minuto * 60);
    }

    public void tick(){ //metodo tick, aumenta 1 segundo
        if (segundos>=59){
            segundos=00;
        }else {segundos+=1;}
    }
    public void tickDecrement(){
        if (segundos ==00){
            segundos=59;
        }else {segundos-=1;}
    }

    public void addReloj(EjercicioReloj reloj){
        int segundosTotales=0;
        if(reloj.hora>0){
            reloj.segundos+=3600;
        }
        if (reloj.minuto>0){
            reloj.segundos+=3600;
        }
        segundosTotales=segundos+reloj.segundos;
        convertir(segundosTotales);
        System.out.println(toString());

        }
        public String toString(){return "La hora es: ["+this.hora+this.minuto+this.segundos+"]";}

        public void restaReloj(EjercicioReloj reloj2){
            System.out.println("Segundos"+this.segundos);
            System.out.println("Segundos 2"+reloj2.segundos);
            this.segundos=this.segundos-reloj2.segundos;
            System.out.println(segundos);
            convertir(this.segundos);
        }

    public static void main(String[] args) {
        int segundo=0;
        int segundos2=0;
        Scanner objeto = new Scanner(System.in);
        System.out.println("Ingrese cantidad de segundos");
        segundo=objeto.nextInt();

        reloj EjercicioReloj =new reloj(segundo);
        for (int x=0; x < 10; x++){
            EjercicioReloj.tick();
            System.out.println(EjercicioReloj.toStringg());
        }
        System.out.println("Ingrese cantidad de segundos");
        segundos2=objeto.nextInt();
        Ejercicio01.Dia3.EjercicioReloj reloj2 = new EjercicioReloj(segundos2);
        System.out.println(EjercicioReloj.toStringg());
    }









    }



