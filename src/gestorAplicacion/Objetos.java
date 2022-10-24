package gestorAplicacion;
import java.time.LocalDateTime;
import java.time.Month;

import gestorAplicacion.personas.Medico;
import gestorAplicacion.personas.Paciente;
import gestorAplicacion.personas.tipoDocumento;
import gestorAplicacion.personas.tipoMedico;

public class Objetos {

	public static void main(String[] args) {
		LocalDateTime fecha = LocalDateTime.of(2022, Month.NOVEMBER, 25, 15,30);
		Paciente paciente = new Paciente("Camilo", "Martinez", tipoDocumento.CEDULA, 1074074689, 25, "masculino", 300762957,"mcm@gmail.com", "cra87#12-34", "SURA", false);
		Paciente paciente1 = new Paciente("Maria", "Jaramillo", tipoDocumento.CEDULA, 9403862, 43, "femenino", 301762849,"mj@gmail.com", "calle 3", "SURA", false);
		Medico m1 = new Medico("Sara", "Perez", tipoDocumento.CEDULA, 12345678, 50, "femenino", 6048742, "sp@yahoo.com", "calle 43", 
					tipoCita.GENERAL, tipoMedico.GENERAL, true);
		Medico m2 = new Medico("Mauricio", "Fernandez", tipoDocumento.CEDULA, 98765432, 60, "Masculino", 388030284 ,"mp@hotmail.com", "carrera 78", tipoCita.AUDIOMETRIA, tipoMedico.FONOAUDIOLOGO, true);
		Medico m3 = new Medico("Carlos", "Munera", tipoDocumento.CEDULA, 98765432, 60, "Masculino", 388030284 ,"mp@hotmail.com", "carrera 78", tipoCita.GENERAL, tipoMedico.GENERAL, true);
		Consultorio c1 = new Consultorio(null, null, null, true, fecha, null);
		Consultorio c2 = new Consultorio(null, null, null, true, fecha, null);
		Consultorio c3 = new Consultorio(null, null, null, true, fecha, null);
		System.out.println(paciente1.pedirCita(LocalDateTime.of(2022, Month.NOVEMBER, 25, 15,30), tipoCita.GENERAL, null));
		System.out.println(paciente.pedirCita(LocalDateTime.of(2022, Month.NOVEMBER, 25, 16,30), tipoCita.GENERAL, null));
		System.out.println(paciente.pedirCita(LocalDateTime.of(2022, Month.NOVEMBER, 25, 16,30), tipoCita.AUDIOMETRIA, null)); 
		int id = Cita.listaCitas.get(0).getId();
		int id2 = Cita.listaCitas.get(1).getId();
		System.out.println(paciente1.reagendarCita(id, LocalDateTime.of(2022, Month.NOVEMBER, 25, 16,30)));
		
		System.out.println(paciente.reagendarCita(id2, LocalDateTime.of(2022, Month.DECEMBER, 25, 20,00)));
		System.out.println(c1.consultas);
	}

}
