from gestorAplicacion.personas.Persona import Persona
from gestorAplicacion.personas.Administrador import Administrador
class Medico(Persona):
    def __init__(self, nombre, apellido, documento, numeroDocumento, edad, genero, telefono, correoElectronico,
                 direccion, especialidad, especialista, disponibilidad = False, consultas = None, nomina = None, 
                 sueldo = 50000, medicamento = None):
        super().__init__(nombre, apellido, documento, numeroDocumento, edad, genero, telefono, correoElectronico, direccion)
        if consultas is None:
            consultas = {}
        if nomina is None:
            nomina = {}
        if medicamento is None:
            medicamento = []
        self._especialidad = especialidad
        self._especialista = especialista
        self._disponibilidad = disponibilidad
        self._consultas = consultas
        Administrador.medicos.append(self)
        self.nomina = nomina
        self.sueldo = sueldo
        self.medicamiento = medicamento
        

    # Getters y Setters
    @classmethod
    def getSueldo(self):
        return self._sueldo
    
    def setSueldo(self, sueldo):
        self._sueldo = sueldo
    
    def getNomina(self):
        return self._nomina
    
    def setNomina(self, nomina):
        self._nomina = nomina

    def getEspecialidad(self):
        return self._especialidad
    
    def setEspecialidad(self, especialidad):
        self._especialidad = especialidad

    def isDisponibilidad(self):
        return self._disponibilidad
    
    def setDisponibilidad(self, disponibilidad):
        self._disponibilidad = disponibilidad

    def getConsultas(self):
        return self._consultas
    
    def setConsultas(self, consultas):
        self._consultas = consultas

    def getEspecialista(self):
        return self._especialista
    
    def setEspecialista(self, especialista):
        self._especialista = especialista

    def isContratado(self):
        return self._contratado
    
    def setContratado(self, contratado):
        self._contratado = contratado
