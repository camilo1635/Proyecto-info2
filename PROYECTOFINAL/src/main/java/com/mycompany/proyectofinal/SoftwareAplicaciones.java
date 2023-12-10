package com.mycompany.proyectofinal;

/**
 *
 * @author jc777
 */
public class SoftwareAplicaciones extends Producto {

    private String desarrollador;
    private String sistema_operativo;
    private double version;
    private String licencia;

    public SoftwareAplicaciones() {
        super(6, "Facebook", "red social", 0, 50);
        this.desarrollador = "Bill Gates";
        this.sistema_operativo = "Android & ISO";
        this.version = 10.1;
        this.licencia = "gratuita";
    }

    public SoftwareAplicaciones(SoftwareAplicaciones segundo) {
        super(7, "Minecraft", "VideoJuego", 12000, 100);
        this.desarrollador = "Elon Musk";
        this.sistema_operativo = "Android, ISO, Windons, Linux";
        this.version = 7.2;
        this.licencia = "Edition Premiun";
    }

    public SoftwareAplicaciones(String desarrollador, String sistema_operativo, double version, String licencia) {
        super(8, "Youtube", "Plataforma de videos", 0, 100);
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
        return "SoftwareAplicaciones{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", desarrollador=" + desarrollador + ", sistema_operativo=" + sistema_operativo + ", version=" + version + ", licencia=" + licencia + '}';
    }

}
