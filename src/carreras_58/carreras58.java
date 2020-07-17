package carreras_58;
import java.util.Scanner;
class carreras58 {
	private Scanner sc;
	private String carrera ;
	private int matricula,semestre,carr;
	private float prom;
	public void inicio() {
		sc= new Scanner(System.in);
		System.out.println("Ingresa la carrera a la que pérteneces");
		carrera=sc.next();
		System.out.println("Ingresa la matricula");
		matricula=sc.nextInt();
		System.out.println("Ingres el semestre");
		semestre=sc.nextInt();
		System.out.println("Ingresa el promedio");
		prom=sc.nextFloat();
		if(carrera.equals("Economia") && semestre>=6 && prom>=8.8) {
			System.out.println(matricula+" "+carrera+"Aceptado");}
		else if(carrera.equals("Computacion")&&semestre>6 &&prom>8.5) {
			System.out.println(matricula+" "+carrera +" "+"Aceptado");}
		else if(carrera.equals("administracion")&&semestre>5 &&prom>8.5) {
			System.out.println(matricula+" "+carrera +"Aceptado");}
		else if(carrera.equals("Contabilidad")&&semestre>5 &&prom>8.5) {
			System.out.println(matricula+" "+carrera +"Aceptado");}}
	public static void main(String[] args) {
		// Martinez Dimas Mahonri 1796763
		carreras58 ca=new carreras58();
		ca.inicio();
	}

}
