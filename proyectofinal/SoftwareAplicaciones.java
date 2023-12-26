package proyectofinal;

/**
 *
 * @author jc777
 */
public class SoftwareAplicaciones extends Producto {

    private String desarrollador;
    private String sistema_operativo;
    private double version;
    private String licencia;

    public SoftwareAplicaciones() {//Contructor por Defecto
        super(6, "Grand Theft Auto V", "VideoGame", 150000, 49);
        this.desarrollador = "Rockstar Games";
        this.sistema_operativo = "Steam, EpicGames";
        this.version = 5;
        this.licencia = "No trasmisible";
    }

    public SoftwareAplicaciones(SoftwareAplicaciones segundo) {//ConstructorCopia
        super(7, "Windows", "SistemaOperativo", 120000, 59);
        this.desarrollador = "Microsoft";
        this.sistema_operativo = "Windows 10 PRO";
        this.version = 10;
        this.licencia = "No trasmisible";
    }

    public SoftwareAplicaciones(String desarrollador, String sistema_operativo, double version, String licencia) {//Parametrizado
        super(8, "Office 365", "Word, PPX, OneDrive", 365000, 189);
        this.desarrollador = desarrollador;
        this.sistema_operativo = sistema_operativo;
        this.version = version;
        this.licencia = licencia;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "\nSoftwareAplicaciones{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", desarrollador=" + desarrollador + ", sistema_operativo=" + sistema_operativo + ", version=" + version + ", licencia=" + licencia + '}';
    }

}
