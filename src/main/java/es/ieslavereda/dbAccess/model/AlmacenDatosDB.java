package es.ieslavereda.dbAccess.model;

import java.util.ArrayList;

public interface AlmacenDatosDB {
    public ArrayList<Empleado> getEmpleados();
    public Empleado getEmpleado(String DNI);
    public int updateEmpleado(Empleado empleado);
    public int deleteEmpleado(String dni);
    public boolean addEmpleado(Empleado empleado);
    public boolean authenticate (String login, String passwd);
    public ArrayList<Empleado> getEmpleadosPorCargo(String cargo);

}
