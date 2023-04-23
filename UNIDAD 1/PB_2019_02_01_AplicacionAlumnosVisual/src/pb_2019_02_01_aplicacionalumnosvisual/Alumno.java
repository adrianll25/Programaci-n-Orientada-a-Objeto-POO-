
package pb_2019_02_01_aplicacionalumnosvisual;


public class Alumno {
    //ATRIBUTOS
    private String nombre;
    private int asistencias;
    private int tareas;
    private int proyectos;
    private int examen;
    //COSNTRUCTORES
    public Alumno()
    {
        nombre = "NO-Id";
        asistencias=0;
        tareas=0;
        proyectos=0;
        examen=0;
    }
    public Alumno(String nom, int asist, int tar, int proy, int exam)
    {
        nombre = nom;
        asistencias = asist;
        tareas = tar;
        proyectos = proy;
        examen = exam;
    }
    public Alumno(Alumno a)
    {
        nombre = a.nombre;
        asistencias = a.asistencias;
        tareas = a.tareas;
        proyectos = a.proyectos;
        examen = a.examen;
    }
    //GET/SET
    public String getNombre()
    {
        return nombre;
        
    }
    public int getAsistencias()
    {
        return asistencias;
        
    }
    public int getTareas()
    {
        return tareas;
        
    }
    public int getProyectos()
    {
        return proyectos;
        
    }
    public int getExamen()
    {
        return examen;
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;
    }
    public void setAsistencias(int asist)
    {
        asistencias = asist;
        
    }
    public void setTareas(int tar)
    {
        tareas = tar;
    }
    public void setProyectos(int proy)
    {
        proyectos = proy;
    }
    public void setExamen(int exam)
    {
        examen = exam;
    }
    @Override
    public String toString()
    {
        return nombre + 
                "  Asist:"+ asistencias +
                "  Tareas:"+ tareas +
                "  Proy:"+ proyectos +
                "  Examen: "+ examen;
    }
    //METODOS DE PROCESO
    public double calificacion()
    {
        return asistencias * 0.06 + tareas * 0.12 + proyectos * 0.22 + examen * 0.60;
    }
}
