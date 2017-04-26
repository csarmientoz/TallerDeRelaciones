package Punto1;

public class Carro {
    private String marca;
    private Chassis chasis;
    private Motor moteur;
    private Ruedas[] roue;

    public Carro(String marca, Motor moteur, Ruedas[] roue) {
        this.marca= marca;
        this.chasis = new Chassis( "RK24", "Chevrolet");
        this.moteur = moteur;
        this.roue = roue;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Chassis getChasis() {
        return chasis;
    }

    public void setChasis(Chassis chasis) {
        this.chasis = chasis;
    }

    public Motor getMoteur() {
        return moteur;
    }

    public void setMoteur(Motor moteur) {
        this.moteur = moteur;
    }

    public Ruedas[] getRoue() {
        return roue;
    }

    public void setRoue(Ruedas[] roue) {
        this.roue = roue;
    }
  
    public void mostrarelementos(){
        System.out.println("Marca= " + marca);
        System.out.println("Motor= " + moteur.getMarca()+"---"+moteur.getCaballos_de_fuerza());
        System.out.println("Chassis= "+ chasis.getMarca()+ chasis.getReferencia());    
        for(int i=0; i<4; i++){
        System.out.println(roue[i].getMarca()+"-----" +roue[i].getTamaño_mm());
        }
    }
    }