package test;

public class TipoEmpleado {
    private float salarioBase;
    private puestoTrabajo pt;
    
    enum puestoTrabajo{
        VENDEDOR,
        ENCARGADO
    }

    public TipoEmpleado(puestoTrabajo pt) {
        this.pt = pt;
        if(pt == puestoTrabajo.VENDEDOR){
            this.salarioBase = 1000;
        } else {
            this.salarioBase = 1500;
        }
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public puestoTrabajo getPt() {
        return pt;
    }
    
    
    
}
